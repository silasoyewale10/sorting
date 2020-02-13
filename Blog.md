
# INSERTION SORT. 20200210
### SUMMARY 
Insertion sort is a way of sorting things by comparing two things at the same time. The two things compared are the adjacent things and each elemt that is larger is moved to the right at that specific instance of comparison. After the comparison is done foe all items, the lowest would be on the left while the highest will be on the right. Since this data structure is an array, th eindexes are what is swapped to reassign a new location for the items. 

## PSEUDOCODE

InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
      
      
 ## ALGORITHMIC EXPLANATION. The given array is [8,4,23,42,16,15]. After the methods is executed, it should be [4,8,15,16,23,42].
 
 ## Iteration 1:
 i =1, j =0, temp = 4; arr.length = 6. 0 is >= 0 and 4 is < 8, so there is going to be a swap. 
 
 ## Iteration 2:
 i =2, j =1, temp = 23; arr.length = 6. 1 is >= 0 but 23 is not less than 8 so no swap. 
 
 ## Iteration 3:
 i =3, j =2, temp = 42; arr.length = 6. 2 is >= 0 but 42 is not less than 23 so no swap.
 
 ## Iteration 4:
 i =4, j =3, temp = 16; arr.length = 6. 3 is >= 0 and 16 is < 42, so there is going to be a swap. 
 
 ## Iteration 5:
 i =5, j =4, temp = 15; arr.length = 6. 4 is >= 0 and 15 is < 42, so there is going to be a swap. 
 
 ## Iteration 6:
 i =6, jumps out of the loop and returns the output array. 
 
 ## Output:
 [4,8,15,16,23,42];
 
 ## Whiteboard image
 ![](https://github.com/silasoyewale10/sorting/blob/master/src/main/resources/assests/whiteboard-26.JPG)





# MERGE SORT. 20200211
### SUMMARY 
Merge sort is a way of sorting things by comparing two things at the same time. The two things compared are the adjacent things and each elemet that is larger is moved to the right at that specific instance of comparison. After the comparison is done for all items, the lowest would be on the left while the highest will be on the right. Since this data structure is an array, th indexes are what is swapped to reassign a new location for the items. Before comparison of values is done, the array is broken down into two and recurively broken till each element in the array occupies an array of its own. At this time, the helper method called merge can be called on these arrays to sort them. 

## PSEUDOCODE

ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
      

## ALGORITHMIC EXPLANATION. The given array is [5,33,6,10,4,7,8,9]. After the methods is executed, it should be [4,5,6,7,8,9,10,33].
 
 ## Iteration 1:
The array is split into left as[5,33,6,10] 
 ## Iteration 2:
 The array is split into right as [4,7,8,9] 

 ## Iteration 3:
left is split as [5,33] and [6,10] 
 ## Iteration 4:
left is split as [5], [33], [6], [10] 
 ## Iteration 5:
5 and 33 are comapared and 6 ansd 10 are compared. They stay the same because the higher value is already on the right.  
 ## Iteration 6:
6 and 33 are compared and 10 and 33 are compared to get this result 5,6,10,33



## Iteration :7
right is split as [4,7] and [8,9] 
 ## Iteration 8:
left is split as [4], [7], [8], [9] 
 ## Iteration 9:
4 and 7 are comapared and 8 and 9 are compared. They stay the same because the higher value is already on the right. We get this result 5,6,10,33
 
 ## Iteration 10:
Here, merge merges both sorted and produce [4,5,6,7,8,9,10,33]
 ## Output:
[4,5,6,7,8,9,10,33] 
 ## Whiteboard image
 ![](https://github.com/silasoyewale10/sorting/blob/master/src/main/resources/assests/whiteboard-27.JPG)





# QUICK SORT. 20200212
### SUMMARY 
Quick sort is a way of sorting things by comparing two things at the same time. The two things compared are the adjacent things and each elemet that is larger is moved to the right at that specific instance of comparison. After the comparison is done for all items, the lowest would be on the left while the highest will be on the right. Since this data structure is an array, th indexes are what is swapped to reassign a new location for the items. The swapping needs a point of reference called the pivot. the pivot has a value and moves everyhing lesser than the pivot is on the pivot's left and everything higher than the pivot is on the pivots right. The pivot is set with the partition helper method and the location swapping is done with the swapping helper method. 

## PSEUDOCODE
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp



## ALGORITHMIC EXPLANATION. The given array is [8,4,23,42,16,15]]. After the methods is executed, it should be [4,8,15,16,23,42].
 
 ## Round 1:
The partition function is called to determine the pivot position

## Round 2
The array is rearranged with the swap function as 8,4,15,23,42,16. The quicksort is called on 8 and 4 and rearranged as 4,8.

## Round 3
Quicksort is recurively called on partition function to determine new pivot position for the right

## Round 4: 
Partition returns 5, the index for 16. quicksort is called on (Arr, 3,5) and partitino returns 5
## Round 5
swap is invoked to swap 16 for 23 and partition returns 4 leaving only 16.

## rOUND 6
base case is triggered and execution ends.

## Whiteboard image
 ![](https://github.com/silasoyewale10/sorting/blob/master/src/main/resources/assests/whiteboard-28.JPG)

