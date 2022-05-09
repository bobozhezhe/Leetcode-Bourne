package Leetcode_Bourne.arrays;

import java.util.*;

public class TwoNumberSum {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int[] res = Program1.twoNumberSum(arr, 10);

        for (int re : res) System.out.print(re + "\t");
    }
}

class Program1 {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int i, j;
        int n = array.length;

        for(i = 0; i < n; i++)
            for(j = i + 1; j < n; j++)
                if(array[i] + array[j] == targetSum)
                    return new int[]{array[i], array[j]};

        return new int[0];
    }
}
class Program2 {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Set<Integer> hm = new HashSet<>();
        int diff = 0;

        for(int i = 0; i < array.length; i++){
            diff = targetSum - array[i];
            if(hm.contains(diff)){
                return new int[]{array[i], diff};
            }
            hm.add(array[i]);
        }

        return new int[0];
    }
}