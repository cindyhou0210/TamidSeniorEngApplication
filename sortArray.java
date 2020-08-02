import java.util.*;
import java.io.*;
public class sortArray{
  public static void main(String[] args){
    int[] a1 = {1, 3, 5, 8};
    int[] a2 = {};
    int k = 10;
    int[] awnser = sortArrays(a1,a2,k);
    System.out.print("sortArrays(arr1, arr2, k) returns: \n");
    System.out.print(Arrays.toString(awnser));
  }

  /**
  @MethodName: SortArrays
  @Details: Given 2 sorted arrays and a number k, return an array holdiig the first k elements.
  @param arr1,arr2,k: The two sorted arrays that we will be grabbing elements from.
                      The number of elements we want.
  @return combined: The returned sorted array holding elements from arr1 and arr2.

  */
  public static int[] sortArrays(int[] arr1, int[] arr2, int k){
    //We create combined, our array that will be returned. It will be k in size unless arr1+arr2<k.
    int[] combined = new int[arr1.length + arr2.length];
    if(k < arr1.length + arr2.length){
      combined = new int[k];
    }

    //We will use two pointers temp1/temp2 that will go through both arr1 and arr2 while adding nums to combined.
    int temp1 = 0;
    int temp2 = 0;

    //The while loop will continuously add elements to combined until we hit k.
    while(temp1 + temp2 < k){
      /*This if statement is executed if we want to add an element from arr1 to combined.
      The statements in the if/else if cover 3 conditions
          1.)temp1 < arr1.length | We can not add something from arr1 if we are at the end of the array.
          2.)arr2.length == 0 | If the second array is empty then we don't need to compare to it, just add from arr1.
          3.)arr1[temp1] <= arr2[temp2] | The usual comparison,
              add from either arr1/arr2 depending on the smaller num.*/
      if(temp1 < arr1.length && (arr2.length == 0 || arr1[temp1] <= arr2[temp2])){
        combined[temp1+temp2] = arr1[temp1];
        temp1++;
      //Or if we will add an element from arr2 to combined.
      }else if(temp2 < arr2.length && (arr1.length == 0 || arr1[temp1] >= arr2[temp2])){
        combined[temp1+temp2] = arr2[temp2];
        temp2++;
      //In the case that k>arr1.length + arr2.length we can return combined as it has all possible elements.
      }else{
        return combined;
      }
    }
    //After adding the appropriate elements from arr1 and arr2 we return combined.
    return combined;
  }
}
