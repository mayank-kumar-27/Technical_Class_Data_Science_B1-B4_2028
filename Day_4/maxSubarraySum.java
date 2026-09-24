// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution {
    int maxSubarraySum(int[] arr) {
        int c = arr[0], m = arr[0];
        for (int x : arr) {
            c = Math.max(x, c + x);
            m = Math.max(m, c);
        } return m;
    }
}