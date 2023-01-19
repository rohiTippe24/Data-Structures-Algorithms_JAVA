public class DSA_5_SubstractionOfTwoArray {
  public static void main (String[] args) {
 
  int[] MaxArr = new int[] {2 , 5 , 9, 4 , 3};
  int[] MinArr = new int[] {1 , 3 , 4 };
  int[] sub = new int[Math.max(MaxArr.length , MinArr.length)];
  
  int i = MaxArr.length-1;
  int j = MinArr.length-1;
  int k = sub.length-1;
  boolean flag = false;
  
  while (k >= 0) {
    int max = (flag) ? MaxArr[i]-1 : MaxArr[i];
    int min = (j >= 0) ? MinArr[j] : 0;
    
    if (max < min) {
      max += 10;
      flag = true;
    } else {
      flag = false;
    }
    sub[k] = max-min;
    k--;
    j--;
    i--;
  }
 for (int elem : sub)
  System.out.print(elem);
  }
}