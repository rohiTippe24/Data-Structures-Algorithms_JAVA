import java.util.Stack;
public class DSA_12_InfixEvalution {
  static Stack<Character> operator = new Stack<>();
  static Stack<Integer> operend = new Stack<>();
  static int pre (char c) {
    if (c == '+' || c == '-')
      return 1;
    return 2;
    }
    static int operation (char ch , int n1 , int n2) {
      if (ch == '+') 
        return n1 + n2;
      if (ch == '-')
        return n1 - n2;
      if (ch == '*')
        return n1 * n2;
      return n1 / n2;
    }
  public static void main (String[] args)  {
    String expr = "{(2*2)+[5*(5-2)]*2}";
    char[] chr = expr.toCharArray();
    for (char i : chr) {
      if (i == '*' || i == '/' || i == '+' || i == '-') {
        if (!operator.isEmpty() && operator.peek() != '(' && operator.peek() != '{' && operator.peek() != '[') {
          char ch = operator.peek();
          if (pre(ch) >= pre(i)) {
            int n2 = operend.peek();
            operend.pop();
            int n1 = operend.peek();
            operend.pop();
            operend.push(operation(ch , n1 , n2));
            operator.pop();
            operator.push(i);
          } else {
            operator.push(i);
          }
        } else {
          operator.push(i);
        } 
      } else if ( i == '(' || i == '{' || i == '[') {
        operator.push(i);
      }else if (i == ')') {
          while (operator.peek() != '(') {
            char cr = operator.peek();
            int n2 = operend.peek();
            operend.pop();
            int n1 = operend.peek();
            operend.pop();
            operend.push(operation(cr , n1 , n2));
            operator.pop();
          }
          operator.pop();
          }else if (i == '}') {
          while (operator.peek() != '{') {
            char cr = operator.peek();
            int n2 = operend.peek();
            operend.pop();
            int n1 = operend.peek();
            operend.pop();
            operend.push(operation(cr , n1 , n2));
            operator.pop();
          }
          operator.pop();
          }else if (i == ']') {
          while (operator.peek() != '[') {
            char cr = operator.peek();
            int n2 = operend.peek();
            operend.pop();
            int n1 = operend.peek();
            operend.pop();
            operend.push(operation(cr , n1 , n2));
            operator.pop();
          }
          operator.pop();
          }else {
        operend.push(Integer.valueOf(i - '0'));
      }
    }
    System.out.println( " =>  " + operend.peek());
  }
}