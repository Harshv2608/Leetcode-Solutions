class Solution {
    public int maxStability(int n, int[][] edges, int k) {
        int left = 0, right = 200000;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canFormST(n, edges, k, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private boolean canFormST(int n, int[][] edges, int k, int X) {
        DSU dsu = new DSU(n);
        int edgesUsed = 0;
        int upgradesUsed = 0;

        // 1. Mandatory Edges Check
        for (int[] e : edges) {
            if (e[3] == 1) {
                if (e[2] < X) return false; // Must edge too weak
                if (!dsu.union(e[0], e[1])) return false; // Cycle with must edges
                edgesUsed++;
            }
        }

        // 2. Use "Free" optional edges (strength >= X)
        for (int[] e : edges) {
            if (e[3] == 0 && e[2] >= X) {
                if (dsu.union(e[0], e[1])) {
                    edgesUsed++;
                }
            }
        }

        // 3. Use "Upgradable" edges (strength < X but 2*strength >= X)
        for (int[] e : edges) {
            if (e[3] == 0 && e[2] < X && 2 * e[2] >= X) {
                if (upgradesUsed < k) {
                    if (dsu.union(e[0], e[1])) {
                        edgesUsed++;
                        upgradesUsed++;
                    }
                }
            }
        }

        // Valid if we connected all n nodes (n-1 edges)
        return edgesUsed == n - 1;
    }

    // Standard Disjoint Set Union for connectivity
    class DSU {
        int[] parent;
        public DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        public int find(int i) {
            if (parent[i] == i) return i;
            return parent[i] = find(parent[i]);
        }
        public boolean union(int i, int j) {
            int rootI = find(i);
            int rootJ = find(j);
            if (rootI != rootJ) {
                parent[rootI] = rootJ;
                return true;
            }
            return false;
        }
    }
}