package Leetcode_Bourne.AlgoExport.arrays;

import java.util.*;
public class ValidateSubsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        List<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            arrList.add(num);
        }

        int[] seq = new int[]{1, 6, -1, 10};
        List<Integer> seqList = new ArrayList<>();
        for (int num : seq) {
            seqList.add(num);
        }

        boolean res = isValidSubsequence1(arrList, seqList);
        System.out.printf(String.valueOf(res));
    }

    public static boolean isValidSubsequence1(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int n = array.size(), m = sequence.size();
        int cur = 0, first_match = -1, i, j = 0;
        for (i = 0; i < m; i++) {
            for (j = cur; j < n; j++) {
                if (Objects.equals(sequence.get(i), array.get(j))) {
                    cur = j + 1;
                    if (i == 0)
                        first_match = j;
                    break;
                }
            }
            // no match
            if (j == n && i == 0)
                return false;
                // return to 1st match point
            else if (j == n) {
                i = -1;
                j = first_match + 1;
            }
        }
        return j != n;
    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0;
        int seqIdx = 0;
        while (arrIdx < array.size() && seqIdx < sequence.size()) {
            if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
                seqIdx++;
            }
            arrIdx++;
        }
        return seqIdx == sequence.size();
    }
}
