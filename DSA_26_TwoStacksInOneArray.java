public class DSA_26_TwoStacksInOneArray {
  static class Stack {
   int[] arr = new int[5];
   int top1 = -1;
   int top2 = 5;
    
    void push1 (int data) {
      if (top1+1 < top2) {
        arr[++top1] = data;
      } else {
        System.out.println("Stack Overflow");
      }
    }
    // 
    void push2 (int data) {
      if (top2-1 > top1) {
        arr[--top2] = data;
      } else {
        System.out.println("Stack Underflow");
      }
    }
    // 
    int peek1 () {
      return arr[top1];
    }
    // 
    int peek2 () {
      return arr[top2];
    }
    // 
    int pop1 () {
      if (top1 < 0) {
        System.out.println("Stack Underflow");
        return -1;
      }
      return arr[top1--];
    }
    // 
    int pop2 () {
      if (top2 >= arr.length) {
        System.out.println("Stack Underflow");
        return -1;
      }
      return arr[top2++];
    }
  }
  public static void main (String[] args) {
    Stack st = new Stack();
    st.push1(1);
    st.push1(2);
    st.push1(3);
    st.push2(4);
    st.push2(5);
    st.push2(6);
    System.out.println("Stack 1 pop  " + st.pop1());
    System.out.println( "Stack 1 peek  " + st.peek1());
    System.out.println("stack 2 pop  " + st.pop2());
    System.out.println( "Stack 2 peek  " + st.peek2());
  }
}