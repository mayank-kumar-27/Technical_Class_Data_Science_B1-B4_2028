// https://www.geeksforgeeks.org/problems/print-anagrams-together/1

import java.util.*;

class Solution {
    public List<List<String>> anagrams(String[] s) {
        Map<String, List<String>> m = new LinkedHashMap<>();

        for (String x : s) {
            int[] f = new int[26];
            
            for (char c : x.toCharArray()) f[c - 'a']++;
            StringBuilder k = new StringBuilder();
            for (int v : f) k.append(v).append('#');

            m.putIfAbsent(k.toString(), new ArrayList<>());
            m.get(k.toString()).add(x);
        } return new ArrayList<>(m.values());
    }
}
