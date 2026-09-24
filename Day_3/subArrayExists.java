// https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

class Solution {
    static boolean findsum(int[] a) {
        Set<Integer> s = new HashSet<>();
        int p = 0;
        for (int n : a) {
            p += n;
            if (p == 0 || !s.add(p)) return true;
        } return false;
    }
}