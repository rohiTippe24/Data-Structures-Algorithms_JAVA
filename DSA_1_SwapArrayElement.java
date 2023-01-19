public class DSA_1_SwapArrayElement {
  static void swap (int[] arg, int x , int y) {
    int temp = arg[x];
    arg[x] = arg[y];
    arg[y] = temp;
  }
  public static void main (String[] args) {
    int[] arr = new int[] {12 , 13 , 24 , 25};
    System.out.print("Orignal Array : ");
    for (int i : arr)
      System.out.print(i + "  ");               // 12  13  24  25
    swap(arr , 0 , 2);
    System.out.print("\nAfter Swaping : ");
    for (int i : arr) 
      System.out.print( i + "  ");             // 24  13  12  25
  }
}