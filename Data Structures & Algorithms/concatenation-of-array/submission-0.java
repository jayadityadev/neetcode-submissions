class Solution {
    public int[] getConcatenation(int[] nums) {
        int len_ans = nums.length*2;
        int[] ans = new int[len_ans];
        for (int i = 0; i < len_ans/2; i++) {
            ans[i] = nums[i];
            ans[i+(len_ans/2)] = nums[i];
        }
        return ans;
    }
}