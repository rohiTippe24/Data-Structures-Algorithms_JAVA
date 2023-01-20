import java.util.Stack;
public class DSA_8_NextGreaterElementToTheRight {
  public static void main (String[] args) {
    Stack<Integer> st = new Stack<>();
    int[] arr = new int[] {2 , 5 , 4 , 12 , 7 , 8 , 6};
    for (int i : arr) {
       while (!st.isEmpty() && i > st.peek()) {
         System.out.println(st.peek() + "  =>  " + i);
         st.pop();
       }
       st.push(i);
    }
    for (int i :st)
      System.out.println(i + "  =>  " + "NA");
  }
}