package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test public void testQuickSort1(){
        int [] arr = {8,4,23,42,16,15};
        int [] expected = {4,8,15,16,23,42};
        QuickSort x  = new QuickSort();
        x.quickSort(arr,0,5);
       assertArrayEquals(expected,arr);
    }

    @Test public void testQuickSort2(){
        int [] arr = {20,18,12,8,5,-2};
        int [] expected = {-2,5,8,12,18,20};
        QuickSort x  = new QuickSort();
        x.quickSort(arr,0,5);
        assertArrayEquals(expected,arr);
    }

    @Test public void testQuickSort3(){
        int [] arr = {5,12,7,5,5,7};
        int [] expected = {5,5,5,7,7,12};
        QuickSort x  = new QuickSort();
        x.quickSort(arr,0,5);
        assertArrayEquals(expected,arr);
    }


    @Test public void testQuickSort4(){
        int [] arr = {2,3,5,7,13,11};
        int [] expected = {2,3,5,7,11,13};
        QuickSort x  = new QuickSort();
        x.quickSort(arr,0,5);
        assertArrayEquals(expected,arr);
    }

    @Test public void testQuickSort5(){
        int [] arr = {3,2};
        int [] expected = {2,3};
        QuickSort x  = new QuickSort();
        x.quickSort(arr,0,1);
        assertArrayEquals(expected,arr);
    }

    @Test public void testQuickSort6(){
        int [] arr = {2,3,5,7,11,13};
        int [] expected = {2,3,5,7,11,13};
        QuickSort x  = new QuickSort();
        x.quickSort(arr,0,5);
        assertArrayEquals(expected,arr);
    }

}