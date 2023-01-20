import java.util.Stack;
public class DSA_9_StockSpan {
  public static void main (String[] args) {
    Stack<Integer> st = new Stack<>();
    int[] arr = new int[] {2 , 15 , 3 , 8 , 6 , 13};
    int[] span = new int[arr.length];
    for (int i = 0 ; i < span.length ; i++)
      span[i] = 1;
    for (int i = 0 ; i < arr.length ; i++) {
      while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
        span[i] += span[st.peek()];
        st.pop();
      }
      st.push(i);
    }
    for (int i = 0 ; i < span.length ; i++) {
     System.out.println(arr[i] + "  =>  " + span[i]);
    }
  }
}