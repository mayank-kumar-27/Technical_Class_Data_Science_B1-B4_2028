// https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1

class Solution {
	public int rowWithMax1s(int[][] mat) {
		int m = mat.length, n = mat[0].length;
		int r = 0, c = n - 1, max = -1;
		while (r < m && c >= 0) {
			if (mat[r][c] == 1) { max = r; c--; }
			else r++;
		} return max;
	}
};
