class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int l = stoneValue.length;
        int[] dp = new int[l + 1];
        for(int i = l - 1; i >= 0; i--) {
            int sum = stoneValue[i];
            dp[i] = sum - dp[i + 1];
            if(i + 1 < l) {
                sum += stoneValue[i + 1];
                dp[i] = Math.max(dp[i], sum - dp[i + 2]);
            }
            if(i + 2 < l) {
                sum += stoneValue[i + 2];
                dp[i] = Math.max(dp[i], sum - dp[i + 3]);
            }
        }
        if(dp[0] == 0) {
            return "Tie";
        }
        else if(dp[0] > 0) {
            return "Alice";
        }
        else {
            return "Bob";
        }
    }
}
