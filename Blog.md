
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


