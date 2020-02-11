
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
 
 Output:
 [4,8,15,16,23,42];
