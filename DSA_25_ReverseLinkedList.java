public class DSA_25_ReverseLinkedList {
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
    void rev (Node node) {
      if (node.next == null) {
        return;
      }
      rev(node.next);
      if (node != tail)
        node.next.next = node;
    }
    void reverse () {
      rev(head);
      head.next = null;
      Node temp = head ;
      head = tail;
      tail = temp;
    }
    void display () {
      Node temp = head;
      while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
      }
    }
  }
    public static void main (String[] args) {
      LinkedList ll = new LinkedList();
      int[] arr = new int[] {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
      ll.add(arr);
      ll.reverse();
      ll.display();
  }
}