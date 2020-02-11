package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

@Test
    public void testInsertionSort1(){
    Sort x = new Sort();
    int [] arr = {8,4,23,42,16,15};
    x.InsertionSort(arr);
//    System.out.println(Arrays.toString(x.InsertionSort(arr)));
    int [] expected = {4,8,15,16,23,42};
    assertArrayEquals(expected, x.InsertionSort(arr));
}
    @Test
    public void testInsertionSort2(){
        Sort x = new Sort();
        int [] arr = {20,18,12,8,5,-2};
        x.InsertionSort(arr);
//    System.out.println(Arrays.toString(x.InsertionSort(arr)));
        int [] expected = {-2,5,8,12,18,20};
        assertArrayEquals(expected, x.InsertionSort(arr));
    }

    @Test
    public void testInsertionSort3(){
        Sort x = new Sort();
        int [] arr = {5,12,7,5,5,7};
        x.InsertionSort(arr);
//    System.out.println(Arrays.toString(x.InsertionSort(arr)));
        int [] expected = {5,5,5,7,7,12};
        assertArrayEquals(expected, x.InsertionSort(arr));
    }

    @Test
    public void testInsertionSort4(){
        Sort x = new Sort();
        int [] arr = {2,3,5,7,13,11};
        x.InsertionSort(arr);
//    System.out.println(Arrays.toString(x.InsertionSort(arr)));
        int [] expected = {2,3,5,7,11,13};
        assertArrayEquals(expected, x.InsertionSort(arr));
    }

    @Test
    public void testInsertionSort5(){
        Sort x = new Sort();
        int [] arr = {-22,-300,-55,-7,-13,-11};
        x.InsertionSort(arr);
//    System.out.println(Arrays.toString(x.InsertionSort(arr)));
        int [] expected = {-300,-55,-22,-13,-11,-7};
        assertArrayEquals(expected, x.InsertionSort(arr));
    }
}