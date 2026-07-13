class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Bruteforce
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        // HashMap
        // HashMap<Integer, Integer> arr_freq = new HashMap<>();
        // for (int num : nums) {
        //     if (arr_freq.get(num) == null)
        //         arr_freq.put(num, 1);
        //     else
        //         arr_freq.put(num, arr_freq.getOrDefault(num, 0)+1);
        // }
        // for (int num : nums) {
        //     if (arr_freq.get(num) > 1) {
        //         return true;
        //     }
        // }
        // return false;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.add(num) == false) {
                return true;
            }
        }
        return false;
    }
}