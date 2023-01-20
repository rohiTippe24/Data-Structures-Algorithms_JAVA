import java.util.Stack;
public class DSA_7_BalancedBrackets {
  public static void main (String[] args) {
    Stack<Character> st = new Stack<>();
    String expr = "[{(2*4)+{6*(2*2)}]";
    char[] chr = expr.toCharArray();
    boolean flag = false;
    for (char i : chr) {
      if (i == '(' ) {
        st.push(')');
      } else if (i == '{') {
        st.push('}');
      } else if (i == '[') {
        st.push(']');
      }
      if (i == ')' || i == '}' || i == ']') {
        if (st.isEmpty()) {
          flag = false;
          st.push('N');
          break;
        }
        if (i == st.peek()) {
          flag = true;
          st.pop();
        } else {
          flag = false;
          break;
        }
      } 
    }
    flag = (st.isEmpty()) ? true : false;
    System.out.println(flag ? "balanced" : "unbalanced");
  }
}