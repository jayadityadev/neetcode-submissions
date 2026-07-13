class Solution {
    public boolean hasDuplicate(int[] nums) {
        // // // Brute Force - O(N^2)
        // for (int i = 0; i < nums.length-1; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i] == nums[j])
        //             return true;
        //     }
        // }
        // return false;

        // // Better
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length-1; i++) {
        //     if (nums[i] == nums[i+1])
        //         return true;
        // }
        // return false;

        // Optimize - HashSet
        Set<Integer> uniq = new HashSet<>();
        for (int num : nums) {
            if (uniq.add(num) == false)
                return true;
        }
        return false;

    }
}