// https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1

class Solution {
    int single(int[] arr) {
        int x = 0;
        for (int n : arr) x ^= n;
        return x;
    }
}