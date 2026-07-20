class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int i,j;
        int m=grid.length;
        int n=grid[0].length;int t=m*n;
        k%=t;
        List<List<Integer>> ans = new ArrayList<>();
        for (i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (j = 0; j < n; j++) {
                row.add(0);
            }
            ans.add(row);
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                int index = i * n + j;
                int newIndex = (index + k) % t;

                int newRow = newIndex / n;
                int newCol = newIndex % n;

                ans.get(newRow).set(newCol, grid[i][j]);
            }
        }

        return ans;
    }
}
