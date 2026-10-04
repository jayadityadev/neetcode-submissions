class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (!seen.containsKey(compliment)) {
                seen.put(nums[i], i);
            } else {
                return new int[]{seen.get(compliment), i};
            }
        }
        return new int[]{-1,-1};
    }
}
