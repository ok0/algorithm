package eats.second;

import java.util.Arrays;

class Solution {
    public long solution(int n, int r, int c) {
        Long[][] matrix = new Long[n][n];

        int xyLimit = (n-1);
        int x = 0, y = -1;
        long vLimit = (n*n);
        long v = 1;
        boolean up = true;
        while (v <= vLimit) {
            if (x == xyLimit) {
                matrix[++y][x] = v++;
                up = false;
            }

            if (y == xyLimit) {
                matrix[y][++x] = v++;
                up = true;
            }

            if (y == 0) {
                matrix[y][++x] = v++;
                up = false;
            }

            if (x == 0) {
                matrix[++y][x] = v++;
                up = true;
            }

            if (up && x != xyLimit && y != 0) {
                matrix[--y][++x] = v++;
            }

            if (!up && x != 0 && y != xyLimit) {
                matrix[++y][--x] = v++;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        return matrix[r-1][c-1];
    }
}