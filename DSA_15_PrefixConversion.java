import java.util.Stack;
public class DSA_15_PrefixConversion {
  static Stack<Integer> value = new Stack<>();
  static Stack<String> infix = new Stack<>();
  static Stack<String> postfix = new Stack<>();
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
    String expr = "+1/*-2345";
    for (int j = expr.length()-1 ;j >= 0 ; j--) {
      char i = expr.charAt(j);
      if (i == '+' || i == '-' || i == '*' || i == '/') {
        String inf1 = infix.pop();
        String inf2 = infix.pop();
        infix.push("(" + inf1 + i + inf2 + ")");
        
        String post1 = postfix.pop();
        String post2 = postfix.pop();
        postfix.push(i + post1 + post2);
        
        int val1 = value.pop();
        int val2 = value.pop();
        value.push(operation(val1 , val2 , i));
      } else {
        value.push(i - '0');
        infix.push(i + "");
        postfix.push(i + "");
      }
    }
    System.out.println( " VALUE  =>  " + value.pop());
    System.out.println( " INFIX  =>  " + infix.pop());
    System.out.println( "POSTFIX =>  " + postfix.pop());
  }
}