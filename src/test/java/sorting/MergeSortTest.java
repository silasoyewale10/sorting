package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test public void testMerge(){
        MergeSort x = new MergeSort();
        int [] a = {3,23,230};
        int [] b = {150,600,4200};
        int [] c = new int[a.length + b.length];
        System.out.println("c.length = " + c.length);
        x.merge(a,b,c);

//        System.out.println(Arrays.toString(x.merge(a,b,c)));
        int [] expected = {3,23,150,230,600,4200};
        assertArrayEquals(expected, c);
    }



    @Test public void testMergeSort1(){
        MergeSort x = new MergeSort();
        int [] a = {8,4,23,42,16,15};
        x.mergeSort(a);
        int [] expected = {4,8,15,16,23,42};
        assertArrayEquals(expected, a);
    }

    @Test public void testMergeSort2(){
        MergeSort x = new MergeSort();
        int [] a = {20,18,12,8,5,-2};
        x.mergeSort(a);
        int [] expected = {-2,5,8,12,18,20};
        assertArrayEquals(expected, a);
    }

    @Test public void testMergeSort3(){
        MergeSort x = new MergeSort();
        int [] a = {5,12,7,5,5,7};
        x.mergeSort(a);
        int [] expected = {5,5,5,7,7,12};
        assertArrayEquals(expected, a);
    }

    @Test public void testMergeSort4(){
        MergeSort x = new MergeSort();
        int [] a = {2,3,5,7,13,11};
        x.mergeSort(a);
        int [] expected = {2,3,5,7,11,13};
        assertArrayEquals(expected, a);
    }



}