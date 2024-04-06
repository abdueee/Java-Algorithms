package Searches;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.*;

import org.junit.Test;


public class BinarySearch2dArrayTest {

	//---------------ISP TESTING-------------------------------------

	// ISP testing with BVA
    @Test
    void ISP_testBVATesting() {
        int[][] emptyArray = {};
        assertArrayEquals(new int[]{-1, -1}, BinarySearch2dArray.BinarySearch(emptyArray, 5));
        
        //testSingleRowArray
        int[][] singleRowArray = {{1, 2, 3, 4, 5}};
        assertArrayEquals(new int[]{0, 2}, BinarySearch2dArray.BinarySearch(singleRowArray, 3));
        assertArrayEquals(new int[]{-1, -1}, BinarySearch2dArray.BinarySearch(singleRowArray, 10));
        
        //testSingleColumnArray
        int[][] singleColumnArray = {{1}, {2}, {3}, {4}, {5}};
        assertArrayEquals(new int[]{2, 0}, BinarySearch2dArray.BinarySearch(singleColumnArray, 3));
        assertArrayEquals(new int[]{-1, -1}, BinarySearch2dArray.BinarySearch(singleColumnArray, 10));
    }
    
    
    //ISP testing with equivalance partition
    
    @Test
    void testSortedArrayWithTargetPresent() {
        int[][] sortedArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertArrayEquals(new int[]{1, 1}, BinarySearch2dArray.BinarySearch(sortedArray, 5));
        
        //test with unsorted array
        int[][] unsortedArray = {{3, 1, 2}, {6, 4, 5}, {9, 7, 8}};
        assertArrayEquals(new int[]{-1, -1}, BinarySearch2dArray.BinarySearch(unsortedArray, 5));
    }



}