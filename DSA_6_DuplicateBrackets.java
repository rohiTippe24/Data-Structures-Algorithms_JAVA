import java.util.Stack;
public class DSA_6_DuplicateBrackets {
  public static void main (String[] args) {
    Stack<Character> st = new Stack<>();
    String expr = "(2+5)+((5*5))";
    boolean flag = false;
    for (int i = 0 ; i < expr.length() ; i++) {
      char ch = expr.charAt(i);
      if (ch != ')') {
        st.push(ch);
      } else {
        if (st.peek() == '(') {
          st.pop();
          flag = true;
        } else {
          while (!st.isEmpty()) {
            if (st.peek() == '(') {
              st.pop();
              break;
            }
            st.pop();
          }
        }
      }
     }
     System.out.println( (flag) ? "Duplicates Brackets Avaible " : "Duplicate Brackets Not Avaible" );
    }
  }