class Stack {
  int[] arr;
  int top = -1;
  Stack (int n) {
    arr = new int[n];
  }
  public void push (int data) {
    arr[++top] = data;
  }
  public int peek () {
    return arr[top];
  }
  public int pop () {
    return arr[top--];
  }
  public int size () {
    return top +1;
  }
  public boolean isEmpty () {
    return (top == -1) ? true : false;
  }
  public void display () {
    System.out.print("[ ");
    for (int i = 0 ; i <= top ; i++) 
      System.out.print(arr[i] +  "  ");
    System.out.print("]");
  }
}
public class DSA_18_BuildNormalStack {
  public static void main (String[] args) {
    Stack st = new Stack(10);
    st.push(24);
    st.push(1);
    st.push(2002);
    st.push(3000);
    System.out.println("peek  =>  " + st.peek());
    System.out.println("pop  =>  " + st.pop());
    System.out.println("size  =>  " + st.size());
    System.out.println("isEmpty  =>  " + st.isEmpty());
    System.out.print("display  =>  "); st.display();
    
  }
}