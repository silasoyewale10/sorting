package sorting;

import java.util.Arrays;

public class QuickSort {
    // [7,9,3,4,7,1,7]
    //left =0
    //right = 5
    public void quickSort(int [] arr, int left, int right){
       if(left < right){
           int position = partition(arr, left, right);
           quickSort(arr, left, position -1);  //if position is 5(Index of pivot). sorts from 0 to 4
           quickSort(arr, position + 1, right);//if position is 5. sorts from 6 to the end
       }
        System.out.println(Arrays.toString(arr));
    }
    public int partition(int [] arr, int left, int right){
        //left is 0
        //right is 5
        int pivot = arr[right];  //sets pivot as the last item in the array
        int low = left -1; // low starts as -1

        for(int i = left; i <right; i++){
            if(arr[i] <= pivot){  // all items less than the pivot value startint at index 0
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, right, low +1);
//        System.out.println("WE are in partition");
        return low + 1;  // returns index of pivot after rearrangement
    }
    public void swap(int [] arr, int i, int low){
        // low is 0
        // i is 0. index
        // [7,9,3,4,7,1,7]
        int temp;
        temp = arr[i];  //temp = arr[0] =7
        arr[i]= arr[low];  // element at 0 becomes 7
        arr[low]= temp;
//        System.out.println("we are in swap");
    }
}
