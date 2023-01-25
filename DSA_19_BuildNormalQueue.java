class Queue {
  int[] arr ;
  int front = 0;
  int rare = -1;
  Queue (int n) {
    arr = new int[n];
  }
  public void add (int data) {
    rare = (++rare)%arr.length;
    arr[rare] = data;
  }
  public int remove () {
    return arr[++front];
  }
  public void display () {
    if (rare > front) {
      for (int i = front ; i <= rare % arr.length ; i++)
        System.out.print(arr[i] + "  ");
    } else {
      for (int j = front ; j < arr.length ; j++) 
        System.out.print(arr[j] + "  ");
      for (int k = 0 ; k < front ; k++) 
        System.out.print(arr[k] + "  ");
    }
  }
  public int get () {
    return arr[front];
  } 
  public boolean isEmpty () {
    return (front == rare) ? true : false;
  }
}
public class DSA_19_BuildNormalQueue {
  public static void main (String[] args) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.remove();
    q.add(6);
    q.remove();
    q.add(7);
    System.out.println("GET  =>  " + q.get());
    System.out.println("isEmpty   =>  " + q.isEmpty());
    q.display();
    System.out.println();
  }
}