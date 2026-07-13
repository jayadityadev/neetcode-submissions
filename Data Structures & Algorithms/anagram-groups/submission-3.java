class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            // Sort the string to get the key
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            // Group words with the same key together
            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
