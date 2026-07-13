class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        freq_dict_s = {}
        freq_dict_t = {}
        for ch in s:
            if ch not in freq_dict_s:
                freq_dict_s[ch] = 1
            else:
                freq_dict_s[ch] += 1
        for ch in t:
            if ch not in freq_dict_t:
                freq_dict_t[ch] = 1
            else:
                freq_dict_t[ch] += 1
        if sorted(freq_dict_s.items()) == sorted(freq_dict_t.items()):
            return True
        return False