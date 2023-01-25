public class DSA_24_DisplayReverseLinkedList {
  static class Node {
    Node next;
    int data;
  }
  static class LinkedList {
    Node head;
    Node tail;
    void add (int[] arr) {
      for (int i = 0 ; i < arr.length ; i++) {
        int data = arr[i];
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
          head = tail = newNode;
        } else {
          tail.next = newNode;
          tail = newNode;
        }
      }
    }
    void displayReverse (Node node) {
      if (node == null) 
        return;
      displayReverse(node.next);
      System.out.println(node.data);
    }
  }
    public static void main (String[] args) {
      LinkedList ll = new LinkedList();
      int[] arr = new int[] {1 , 2 , 3 , 4 , 5 , 6 , 7};
      ll.add(arr);
      ll.displayReverse(ll.head);
  }
}