import java.util.Stack;
public class DSA_16_CelebrityProblem {
  public static void main (String[] args) {
     Stack<Integer> st = new Stack<>();
     int[][] arr = new int[][] {{1 , 1 , 0 , 1} , {0 , 1 , 0 , 0} , {1 , 1 , 0 , 1} , {0 , 0 , 0 , 0}};

    for (int i = 0 ; i < 4 ; i++) {
      st.push(i);
    }
     while (st.size() >= 2) {
       int n1 = st.pop();
       int n2 = st.pop();
       if (arr[n1][n2] == 1) {
         st.push(n1);
       } else {
         st.push(n2);
       }
     }
     System.out.println("Celebrity is :  " + st.pop());
  }
}