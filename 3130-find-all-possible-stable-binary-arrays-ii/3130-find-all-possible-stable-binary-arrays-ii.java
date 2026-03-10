class Solution {
    private static final int MOD = 1_000_000_007;

    public int numberOfStableArrays(int zero, int one, int limit) {
        long[][][] dp = new long[zero + 1][one + 1][2];

        for (int i = 0; i <= zero; i++) {
            for (int j = 0; j <= one; j++) {
                if (i == 0 && j == 0) continue;
                if (j == 0) {
                    dp[i][j][0] = (i <= limit) ? 1 : 0;
                    continue;
                }
                if (i == 0) {
                    dp[i][j][1] = (j <= limit) ? 1 : 0;
                    continue;
                }
                dp[i][j][0] = (dp[i - 1][j][0] + dp[i - 1][j][1]) % MOD;
                if (i > limit) {
                    long outOfBounds = dp[i - limit - 1][j][1];
                    dp[i][j][0] = (dp[i][j][0] - outOfBounds + MOD) % MOD;
                }
                dp[i][j][1] = (dp[i][j - 1][0] + dp[i][j - 1][1]) % MOD;
                if (j > limit) {
                    long outOfBounds = dp[i][j - limit - 1][0];
                    dp[i][j][1] = (dp[i][j][1] - outOfBounds + MOD) % MOD;
                }
            }
        }

        return (int) ((dp[zero][one][0] + dp[zero][one][1]) % MOD);
    }
}