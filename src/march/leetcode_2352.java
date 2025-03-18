class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        int res = 0;
        for (int i=0; i<grid.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j<grid.length; j++) {
                row.add(grid[i][j]);
            }
            map.put(row, map.getOrDefault(row, 0) + 1);
        }

        for (int i=0; i<grid.length; i++) {
            List<Integer> colm = new ArrayList<>();
            for (int j = 0; j< grid.length; j++) {
                colm.add(grid[j][i]);
            }

            if (map.containsKey(colm)) {
                res += map.get(colm);
            }
        }

        return res;
    }
}
