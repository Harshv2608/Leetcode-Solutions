class Solution {
    private Boolean[][][] memo;

    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        
        if ((m + n - 1) % 2 != 0 || grid[0][0] == ')' || grid[m - 1][n - 1] == '(') {
            return false;
        }

        memo = new Boolean[m][n][(m + n) / 2 + 1];
        return dfs(grid, m, n, 0, 0, 0);
    }

    private boolean dfs(char[][] grid, int m, int n, int i, int j, int diff) {
        if (grid[i][j] == '(') {
            diff++;
        } else {
            diff--;
        }

        // More ')' than '(' at any point is invalid
        // diff cannot exceed the remaining steps needed to balance
        if (diff < 0 || diff > (m - 1 - i + n - 1 - j)) {
            return false;
        }

        if (i == m - 1 && j == n - 1) {
            return diff == 0;
        }

        if (memo[i][j][diff] != null) {
            return memo[i][j][diff];
        }

        boolean res = false;
        if (i + 1 < m) {
            res = dfs(grid, m, n, i + 1, j, diff);
        }
        if (!res && j + 1 < n) {
            res = dfs(grid, m, n, i, j + 1, diff);
        }

        return memo[i][j][diff] = res;
    }
}