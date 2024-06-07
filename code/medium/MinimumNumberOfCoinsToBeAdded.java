package medium;

import java.util.Arrays;

public class MinimumNumberOfCoinsToBeAdded {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int x = 1;
        int ans = 0;
        for (int i = 0; i < coins.length; i++) {
            if (x > target) {
                break;
            }
            if (coins[i] == x) {
                x *= 2;
            } else if (coins[i] < x) {
                continue;
            } else {
                ans++;
                x *= 2;

            }
        }
        return ans;
    }
}
