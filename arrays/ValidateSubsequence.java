package Leetcode_Bourne.arrays;

import java.util.*;
public class ValidateSubsequence {
}
class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int n = array.size(), m = sequence.size();
        int cur = 0, first_match = -1, i, j = 0;
        for (i = 0; i < m; i++) {
            for (j = cur; j < n; j++) {
                if (sequence.get(i) == array.get(j)) {
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
}
