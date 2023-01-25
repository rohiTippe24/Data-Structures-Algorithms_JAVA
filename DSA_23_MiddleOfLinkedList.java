public class DSA_23_MiddleOfLinkedList {
  public static class Node {
    Node next;
    int data;
  }
  Node head;
  Node tail;
  void add (int[] arr) {
  for (int i = 0 ; i < arr.length ; i++) {
   int data = arr[i];
   Node newNode = new Node();
   newNode.data = data;
   if (head == null) {
     head = tail = newNode;;
   } else {
     tail.next = newNode;
     tail = newNode;
   }
  }
}
  int middle () {
    Node slow = head;
    Node fast = head;
    while (fast.next != null) {
      slow = slow.next;
      try {
        fast = fast.next.next;
      } catch(Exception e) {
        break;
      }
    }
    return slow.data;
  }
  public static void main (String[] args) {
    DSA_23_MiddleOfLinkedList ll = new DSA_23_MiddleOfLinkedList();
    int[] arr = new int[] {2 , 4 , 6 , 8 , 10 , 12 , 14};
    ll.add(arr);
    System.out.println(ll.middle());
  }
}