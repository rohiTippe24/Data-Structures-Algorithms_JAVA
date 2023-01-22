import java.util.Stack;
public class DSA_11_SlidingWindowMaximum {
  public static void main (String[] args) {
    Stack<Integer> st = new Stack<>();
    int[] arr = new int[] {2 , 5 , 4 , 7 , 5 , 1 , 3 , 4 , 6 , 2 , 17};
    int[] ng = new int[arr.length];
    for (int i = 0 ; i < arr.length ; i++) {
      while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
        ng[st.peek()] = i;
        st.pop();
      }
      st.push(i);
    }
    for (int i = 0 ; i < ng.length ; i++) {
      if (ng[i] > i+3) 
        ng[i] = i;
      }
    for(int i = 0 ; i < ng.length ; i++)
      System.out.println(arr[i] + "  =>  " + arr[ng[i]]);
  }
}