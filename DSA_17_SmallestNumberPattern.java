import java.util.Stack;
public class DSA_17_SmallestNumberPattern {
  public static void main (String[] args) {
    Stack<Integer> st = new Stack<>();
    String str = "idiiddi";
    int num = 0;
    for (int i = 0 ; i < str.length() ; i++) {
      char c = str.charAt(i);
      if (c == 'd') {
        st.push(++num);
      } else {
          st.push(++num);
        while (!st.isEmpty()) {
          System.out.println(st.pop());
        }
      } 
    }
    st.push(++num);
    while (!st.isEmpty()) {
      System.out.println(st.pop());
    }
  }
}