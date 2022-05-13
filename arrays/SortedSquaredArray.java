package Leetcode_Bourne.arrays;

import java.util.*;

public class SortedSquaredArray {

    public static void main(String[] args) {
        int[] input_array = new int[]{1, 2, 3, 5, 6, 8, 9};
        int[] res_array = new int[]{1, 4, 9, 25, 36, 64, 81};

        int[] res = sortedSquaredArray1(input_array);
        if(Arrays.equals(res, res_array)){
            System.out.println("1: True!");
        }else {
            System.out.println("1: False!");
        }

        res = sortedSquaredArray2(input_array);
        if(Arrays.equals(res, res_array)){
            System.out.println("2: True!");
        }else {
            System.out.println("2: False!");
        }
    }

    // O(nlogn) time | O(n) space - where n is the length of the input array
    public static int[] sortedSquaredArray1(int[] array) {
        int[] sortedSquares = new int[array.length];
        for (int idx = 0; idx < array.length; idx++) {
            int value = array[idx];
            sortedSquares[idx] = value * value;
        }
        Arrays.sort(sortedSquares);
        return sortedSquares;
    }

    // O(n) time | O(n) space - where n is the length of the input array
    public static int[] sortedSquaredArray2(int[] array){
        int head = 0, end = array.length -1;
        int[] squaredArray = new int[array.length];
        for(int idx =0; idx < array.length; idx++){
            if(Math.abs(array[head]) < Math.abs(array[end])) {
                squaredArray[idx] = array[head] * array[head];
                head++;
            }else {
                squaredArray[idx] = array[end] * array[end];
                end++;
            }
        }
        return squaredArray;
    }
}