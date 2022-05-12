package Leetcode_Bourne.arrays;

import java.util.*;

public class SortedSquaredArray {
    // O(nlogn) time | O(n) space - where n is the length of the input array
    public int[] sortedSquaredArray(int[] array) {
        int[] sortedSquares = new int[array.length];
        for (int idx = 0; idx < array.length; idx++) {
            int value = array[idx];
            sortedSquares[idx] = value * value;
        }
        Arrays.sort(sortedSquares);
        return sortedSquares;
    }
}