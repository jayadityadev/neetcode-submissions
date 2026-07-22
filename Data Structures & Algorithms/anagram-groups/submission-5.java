class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        // List<List<String>> ans = new ArrayList<>();
        // for (List<String> lst : map.values()) {
        //     ans.add(lst);
        // }
        // return ans;
        return new ArrayList<>(map.values());
    }
}
