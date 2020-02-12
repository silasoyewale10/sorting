package sorting;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int [] arr){
        int n = arr.length;
        if (n > 1){
            int mid = n/2;
            int [] left = new int[mid];
            int [] right = new int[n-mid];
            for(int x = 0; x < mid; x++){
                left[x] = arr[x];
            }
            for(int y = 0; y < n-mid; y++){
                right[y] = arr[y + mid];
            }
            mergeSort(left); //splits all left into indidvual elemental arrays
            mergeSort(right); //splits all right into indidvual elemental arrays
//            System.out.println("Arrays.toString(right) = " + Arrays.toString(right));
//            System.out.println("Arrays.toString(left) = " + Arrays.toString(left));
            merge(left, right, arr);
//            System.out.println(Arrays.toString(merge(left, right, arr)));

        }
//        return merge(left, right, arr);

    }
    public void merge(int [] left, int [] right, int [] arr){
//        System.out.println("left[0] = " + left[0]);
//        System.out.println("right[0] = " + right[0]);

        int i = 0;
        int j =0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i = i +1;
            }
            else{
                arr[k] = right[j];
                j = j +1;
            }
            k = k +1;
        }
//        if(i == left.length){ //left is full
        while(i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
//        return arr;
    }
}
