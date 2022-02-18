import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {20,5, 4, 6, 4, 6,0, 9, 12, 89, 89, 244, 6756, 213, 24, 23, 67};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {20,5, 4, 6, 4, 6,0, 9, 12, 89, 89, 244, 6756, 213, 24, 23, 67};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
