import java.util.Stack;
public class DSA_10_LargestAreaHistogram {
  public static void main (String[] args) {
    Stack<Integer> st = new Stack<>();
    int[] arr = new int[] {2 , 3 , 5 , 3 , 5 , 1};
    int[] leftMin = new int[arr.length];

    for (int i = 0 ; i < arr.length ; i++) {
      while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
        leftMin[i] += leftMin[st.peek()]+1;
        st.pop();
      }
      st.push(i);
    }
    
    Stack<Integer> st2 = new Stack<>();
    int[] rightMin = new int[arr.length];
    for (int i = arr.length-1 ; i >= 0 ; i--) {
      while (!st2.isEmpty() && arr[st2.peek()] >= arr[i]) {
        rightMin[i] += rightMin[st2.peek()]+1;
        st2.pop();
      }
      st2.push(i);
    }
    int area = 0;
    for (int i = 0 ; i < arr.length ; i++) {
      area = Math.max(arr[i] * (leftMin[i] + rightMin[i] + 1) , area);
    }
    System.out.println("Largest Area  :  " + area);
  }
}

// Finally 🥱