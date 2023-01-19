public class DSA_3_BarChartOfArray {
  public static void main (String[] args) {
    int[] arr = new int[] {2 , 5 , 1 , 3};
    int max = arr[0];
    for (int i = 1 ; i < arr.length ; i++) 
      max = (max < arr[i]) ? arr[i] : max;
      
      for (int j = max ; j > 0 ; j--) {
        for (int i = 0 ; i < arr.length ; i++)
          System.out.print((arr[i] >= j) ? " * " : "   "); 
        System.out.println();
      }
    }
  }