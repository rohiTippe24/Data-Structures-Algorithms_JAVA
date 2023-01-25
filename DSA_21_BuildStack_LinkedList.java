public class DSA_21_BuildStack_LinkedList {
   static class Node {
    Node next;
    int data;
  }
   static class Stack {
    Node top;
    int size = 0;
    void push (int data) {
      Node newNode = new Node();
      newNode.data = data;
      if (top == null) {
        top = newNode;
      } else {
        newNode.next = top;
        top = newNode;
      }
      size++;
    }
    // 
    int peek () {
      return top.data;
    }
    // 
    int pop () {
      int popReturn = top.data;
      top = top.next;
      size--;
      return popReturn;
    }
    // 
    int size () {
      return size;
    }
    // 
    boolean isEmpty () {
      return (top == null) ? true : false;
    }
  }
  
  public static void main (String[] args) {
    Stack st = new Stack();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    System.out.println("POP  =>  " + st.pop());
    System.out.println("PEEK  =>  " + st.peek());
    System.out.println("SIZE  =>  " + st.size());
    System.out.println("isEmpty  =>  " + st.isEmpty());
  }
}