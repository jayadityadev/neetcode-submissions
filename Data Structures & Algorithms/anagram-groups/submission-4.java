class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // resulting nested list
        List<List<String>> ans = new ArrayList<>();

        // hashmap to store visited status of each index; 0 - unvisited, 1 - visited
        int[] visited = new int[strs.length];

        // take one string at a time from the given array
        for (int i = 0; i < strs.length; i++) {
            if (visited[i] == 1) continue;
            String str_i = strs[i];
            HashMap<Character, Integer> freq_i = new HashMap<>();
            List<String> temp = new ArrayList<>();
            for (char ch_i : str_i.toCharArray()) {
                if (freq_i.get(ch_i) == null)
                    freq_i.put(ch_i, 1);
                else
                    freq_i.put(ch_i, freq_i.get(ch_i) + 1);
            }
            for (int j = 0; j < strs.length; j++) {
                String str_j = strs[j];
                if (str_i.length() != str_j.length() || visited[j] == 1) continue;
                HashMap<Character, Integer> freq_j = new HashMap<>();
                for (char ch_j : str_j.toCharArray()) {
                    if (freq_j.get(ch_j) == null)
                        freq_j.put(ch_j, 1);
                    else
                        freq_j.put(ch_j, freq_j.get(ch_j) + 1);
                }
                if (freq_i.equals(freq_j)) {
                    temp.add(str_j);
                    visited[j] = 1;
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}