class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for (int num : nums) System.out.print(num + " ");
        for (int i = 0; i < nums.length; i++) {
            int anchor = i;
            int count = 1;
            for (int runner = i+1; runner < nums.length; runner++) {
                if (nums[runner] == nums[anchor]+1) {
                    count++;
                    anchor = runner;
                }
            }
            arr[i] = count;
        }
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        return max;
    }
}
