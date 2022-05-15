package Leetcode_Bourne.AlgoExport.arrays;

import java.util.Arrays;

public class NonConstructibleChange {

  public int NonConstructibleChange(int[] coins) {
    Arrays.sort(coins);
    int change = 0;
    for(int coin : coins){
      if(coin > change + 1){
        return change +1;
      } else {
        change += coin;
      }
    }
    return change +1;
  }

  // O(nlogn) time | O(1) space - where n is the number of coins
  public int nonConstructibleChange_ref(int[] coins) {
    Arrays.sort(coins);
    int currentChangeCreated = 0;
    for (int coin : coins) {
      if (coin > currentChangeCreated + 1) {
        return currentChangeCreated + 1;
      }
      currentChangeCreated += coin;
    }
    return currentChangeCreated + 1;
  }

}
