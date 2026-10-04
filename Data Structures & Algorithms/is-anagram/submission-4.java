class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        int length = s.length();

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < length; i++)
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);

        for (int i = 0; i < length; i++)
            freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i), 0) - 1);

        for (int i : freq.values())
            if (i != 0)
                return false;

        return true;
    }
}
