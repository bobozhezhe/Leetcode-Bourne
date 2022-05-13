package Leetcode_Bourne.arrays;

import java.util.*;

public class SortedSquaredArray {

    public static void main(String[] args) {
        int[][] input_array = new int[][]{{1, 2, 3, 5, 6, 8, 9}, {-2, -1}};
        int[][] res_array = new int[input_array.length][];

        for (int i =0; i < input_array.length; i++) {
            res_array[i] = sortedSquaredArray1(input_array[i]);

            int[] res = sortedSquaredArray2(input_array[i]);
            if (Arrays.equals(res, res_array[i])) {
                System.out.println(i + ": True!");
            } else {
                System.out.println(i + ": False!");
                for(int arr : res){
                    System.out.print(arr + ", ");
                }
                System.out.println();
            }
        }
//        int[] res = sortedSquaredArray1(input_array);
//        if(Arrays.equals(res, res_array)){
//            System.out.println("1: True!");
//        }else {
//            System.out.println("1: False!");
//        }

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
        for(int idx = array.length-1; idx >= 0; idx--) {
            squaredArray[idx] = (Math.abs(array[head]) > Math.abs(array[end])) ?
                array[head] * array[head++] :
                array[end] * array[end--];
        }
        return squaredArray;
    }
}