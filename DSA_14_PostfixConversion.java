import java.util.Stack;
public class DSA_14_PostfixConversion {
  static Stack<Integer> value = new Stack<>();
  static Stack<String> infix = new Stack<>();
  static Stack<String> prefix = new Stack<>();
  static int operation (int a , int b , char c) {
    if (c == '+')
      return a+b;
    if (c == '-')
      return a-b;
    if (c == '*')
      return a*b;
    return a/b;
  }
  public static void main (String[] args) {
    String expr = "123-4*5/+";
    char[] chr = expr.toCharArray();
    for (char i : chr) {
      if (i == '+' || i == '-' || i == '*' || i == '/') {
        String inf2 = infix.pop();
        String inf1 = infix.pop();
        infix.push("(" + inf1 + i + inf2 + ")");
        
        String pre2 = prefix.pop();
        String pre1 = prefix.pop();
        prefix.push(i + pre1 + pre2);
        
        int value2 = value.pop();
        int value1 = value.pop();
        value.push(operation(value1 , value2 , i));
      } else {
        infix.push(i + "");
        prefix.push(i + "");
        value.push(i - '0');
      }
    }
    System.out.println(  "VALUE  =>  " + value.pop());
    System.out.println(  "INFIX  =>  " + infix.pop());
    System.out.println(  "PREFIX =>  " + prefix.pop());
  }
}