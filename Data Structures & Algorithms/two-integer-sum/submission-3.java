class Solution {
    // Still O(N^2)

    // public int find(int[] nums, int key) {
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] == key)
    //             return i;
    //     }
    //     return -1;
    // }

    public int[] twoSum(int[] nums, int target) {

        // // Brute Force

        // for (int i = 0; i < nums.length-1; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target)
        //             return new int[]{i, j};
        //     }
        // }
        // return new int[]{-1, -1};

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

        // // Uses find(), but again, still the same as bruteforce.
        // for (int i = 0; i < nums.length; i++) {
        //     int key = target - nums[i];
        //     int key_idx = find(nums, key);
        //     if (key_idx != -1)
        //         return new int[]{i, key_idx};
        // }

        // Optimal - O(N)

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (!map.containsKey(key))   // if key not exists in map
                map.put(nums[i], i);    //      map me current element daalo
            else                        // if key exists in map
                return new int[]{map.get(key), i};  // return [ map[key], indexOfcurrent ]
        }
        return new int[]{-1, -1};
        
    }
}