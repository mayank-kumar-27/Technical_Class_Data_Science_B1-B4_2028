// https://leetcode.com/problems/matrix-diagonal-sum/


// O(n^2) time | O(1) space
class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length, n = mat[0].length, s = 0;
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) {
            if (i == j || i + j == n - 1) s += mat[i][j];
        } return s;
    }
}

// O(n) time | O(1) space
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, s = 0;
        for (int i = 0; i < n; i++) {
            s += mat[i][i]; s += mat[i][n - 1 - i];
            if (i == n - 1 - i) s -= mat[i][i];
        } return s;
    }
}