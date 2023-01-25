public class DSA_22_BuildQueue_LinkedList {
  static class Node {
    Node next;
    int data;
  }
  static class Queue {
    Node front;
    Node rare;
    int size = 0;
    
    void add (int data) {
      Node newNode = new Node();
      newNode.data = data;
      if (size == 0) {
        front = rare = newNode;
      } else {
      rare.next = newNode;
      rare = newNode;
      }
      size++;
    }
    // 
    int get () {
      return front.data;
    }
    // 
    int remove () {
      int rmData = front.data;
      front = front.next;
      size--;
      return rmData;
    }
    // 
    int size () {
      return size;
    }
    // 
    boolean isEmpty () {
      return (front == null) ? true : false;
    }
    }
    public static void main (String[] args) {
      Queue q = new Queue();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      System.out.println("Remove  =>  " + q.remove());
      System.out.println("Get  =>  " + q.get());
      System.out.println("Size  =>  " + q.size());
      System.out.println("isEmpty  =>  " + q.isEmpty());
  }
}