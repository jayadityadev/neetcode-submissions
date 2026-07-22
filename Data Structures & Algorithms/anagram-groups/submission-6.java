class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] arr = new int[26];
            for (char c : strs[i].toCharArray()) {
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            map.computeIfAbsent(key, k -> new ArrayList()).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}
