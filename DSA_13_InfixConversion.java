import java.util.Stack;
public class DSA_13_InfixConversion {
  static Stack<String> postfix = new Stack<>();
  static Stack<String> prefix = new Stack<>();
  static Stack<Character> operator = new Stack<>();
  
  static int precendence (char c) {
    if (c == '+' || c == '-') 
      return 1;
    return 2;
  }
  public static void main (String[] args) {
     String expr = "a+(b-c)*d/f";
     char[] ch = expr.toCharArray();
     for (char i : ch) {
       if (i == '(' ) {
         operator.push(i);
       }else if (i == '+' || i == '-' || i == '*' || i == '/') {
         if (operator.isEmpty() || operator.peek() == '(') {
           operator.push(i);
           continue;
         }
         if (precendence(i) <= precendence(operator.peek())) {
           String post2 = postfix.pop();
           String post1 = postfix.pop();
           postfix.push(post1 + post2 + operator.peek());
           
           String pre2 = prefix.pop();
           String pre1 = prefix.pop();
           prefix.push(operator.pop() + pre1 + pre2);
           
           operator.push(i);
         } else {
           operator.push(i);
         }
       } else if (i == ')') {
         while (operator.peek() != '(') {
           String post2 = postfix.pop();
           String post1 = postfix.pop();
           postfix.push(post1 + post2 + operator.peek());
           
           String pre2 = prefix.pop();
           String pre1 = prefix.pop();
           prefix.push(operator.pop() + pre1 + pre2);
         }
         operator.pop();
       } else {
         postfix.push(i + "");
         prefix.push(i + "");
       }
     }
        while (!operator.isEmpty()) {
           String post2 = postfix.pop();
           String post1 = postfix.pop();
           postfix.push(post1 + post2 + operator.peek());
           
           String pre2 = prefix.pop();
           String pre1 = prefix.pop();
           prefix.push(operator.pop() + pre1 + pre2);
         }
     System.out.println("INFIX    : =>   " + expr);
     System.out.println("POSTFIX  : =>   " + postfix.peek());
     System.out.println("PREFIX   : =>   " + prefix.peek());
  }
}