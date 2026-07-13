class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> freq_s = new HashMap<>();
        char[] char_s = s.toCharArray();
        for (char ch : char_s) {
            if (freq_s.get(ch) == null)
                freq_s.put(ch, 1);
            else
                freq_s.put(ch, freq_s.getOrDefault(ch, 0)+1);
        }
        System.out.println(freq_s);
        HashMap<Character, Integer> freq_t = new HashMap<>();
        char[] char_t = t.toCharArray();
        for (char ch : char_t) {
            if (freq_t.get(ch) == null)
                freq_t.put(ch, 1);
            else
                freq_t.put(ch, freq_t.getOrDefault(ch, 0)+1);
        }
        System.out.println(freq_t);
        if (freq_s.equals(freq_t)) {
            return true;
        }
        return false;
    }
}
