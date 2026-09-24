// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] arr, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int f = t - arr[i];
            if(map.containsKey(f)) { return new int[]{map.get(f), i}; }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}