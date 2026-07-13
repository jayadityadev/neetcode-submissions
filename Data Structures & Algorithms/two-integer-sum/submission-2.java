class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};

        // // Sorted - but loses indices, dont use
        // Arrays.sort(nums);
        // int left = 0;
        // int right = nums.length - 1;
        // while (left < right) {
        //     int currentSum = nums[left] + nums[right];
        //     if (currentSum == target)
        //         return new int[]{left, right};
        //     else if (currentSum > target)
        //         right--;
        //     else if (currentSum < target)
        //         left++;
        // }
        // return new int[]{-1, -1};
    }
}