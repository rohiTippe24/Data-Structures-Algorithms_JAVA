//  Find out defference between maximun and minimum element of an array
public class DSA_2_SpanOfArray {
  public static void main (String[] args) {
    int[] arr = new int[] {54 , 10 , 47 , 100 ,153};
    int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
    for (int i : arr) {
      max = Math.max(max , i);
      min = Math.min(min , i);
    } 
    System.out.println("span of Array  : " + (max-min));          //153 - 10  = 143
  }
}