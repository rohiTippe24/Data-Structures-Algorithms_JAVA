// ex.
// [2 , 4 , 3] + [5 , 3 , 2 , 1] = [5 , 5 , 6 , 4]
public class DSA_4_SumOfTwoArray {
  public static void main (String[] args) {
    int[] arr = new int[]{5 , 4 , 7 , 6 , 3};
    int[] arr2 = new int[]{1 , 5 , 8 , 3};
    int[] sum = new int[Math.max(arr.length , arr2.length)];
    
    int i = arr.length;
    int j = arr2.length;
    int k = sum.length;
    
    while (k > 0)
      sum[--k] = (i > 0 && j > 0) ? arr[--i] + arr2[--j] : (i > 0) ? arr[--i] : arr2[--j];
      
    for (int elem : sum)
     System.out.print(elem + "  ");         // 5  5  12  14  6
  }
}