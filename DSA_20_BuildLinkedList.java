public class DSA_20_BuildLinkedList {
public static class Node {
   Node next;
   int data;
}
public static class LinkedList {
    int size = 0;
    Node head = null;
    Node tail = null;
  
  public void addLast (int data) {
    Node newNode = new Node();
    newNode.data = data;
    if (size == 0) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }
  // 
  void addFirst (int data) {
    Node newNode = new Node();
    newNode.data = data;
    if (size == 0) {
      head = tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    size++;
  }
  // 
  void addAt (int idx , int data) {
    if (idx > size || idx < 0)
      return;
    Node newNode = new Node();
    newNode.data = data;
    Node temp = head;
    for (int i = 0 ; i < idx-1 ; i++) 
      temp = temp.next;
    newNode.next = temp.next;
    temp.next = newNode;
    size++;
  }
  // 
   int size () {
    return size;
  }
  // 
   void display () {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
  // 
  int removeFirst () {
    int rmData = head.data;
    head = head.next;
    size--;
    return rmData;
  }
  // 
  int removeLast () {
    Node temp = head;
    for (int i = 1 ; i < size-1 ; i++)
      temp = temp.next;
    int rmReturn = temp.next.data;
    temp.next = null;
    tail = temp;
    size--;
    return rmReturn;
  }
  // 
  int remmoveAt (int idx) {
    Node temp = head;
    for (int i = 1 ; i < idx-1 ; i++)
      temp = temp.next;
    int rmReturn = temp.next.data;
    temp.next = temp.next.next;
    size--;
    return rmReturn;
  }
  // 
int getFirst () {
  return head.data;
}
// 
int getLast () {
  return tail.data;
}
// 
int getAt (int idx) {
  Node temp = head;
  for (int i = 0 ; i < idx ; i++) {
    temp = temp.next;
  }
  return temp.data;
  }
  // 
  Node getNode (int idx) {
    Node temp = head;
    for (int i = 0 ; i < idx ; i++)
      temp = temp.next;
    return temp;
  }
  // 
  void reverse () {
    int start  = 0;
    int end = size-1;
    while (start < end) {
      int temp = getNode(start).data;
      getNode(start).data = getNode(end).data;
      getNode(end).data = temp;
      start++;
      end--;
    }
  }
  }
  public static void main (String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(0);
    ll.addLast(25);
    ll.addLast(50);
    ll.addLast(75);
    ll.addLast(100);
    ll.addLast(125);
    ll.addAt(5 , 150);
    System.out.println("SIZE  =>  " + ll.size());
    System.out.println("REMOVE FIRST  =>  " + ll.removeFirst());
    System.out.println("GETFIRST  =>  " + ll.getFirst());
    System.out.println("GETLAST  =>  " + ll.getLast());
    System.out.println("GETAT  =>  " + ll.getAt(2));
    System.out.println("REMOVELAST  =>  " + ll.removeLast());
    System.out.println("REMOVEAT  =>  " + ll.remmoveAt(4));
    System.out.println("Display Linked Lish : ");
    ll.display();
    System.out.println("\nDistplay Reversed Linked List");
    ll.reverse();
    ll.display();
  }
}