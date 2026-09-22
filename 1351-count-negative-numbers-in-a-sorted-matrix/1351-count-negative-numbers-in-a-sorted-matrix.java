class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int neg = 0;
        int r = rows - 1;
        int c = 0;
        while (r >= 0 && c < cols) {
            if (grid[r][c] < 0) {
                neg += (cols - c);
                r--;               
            } else {
                c++;             
            }
        }

        return neg;
    }
}