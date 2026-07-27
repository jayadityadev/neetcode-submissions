class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product_before = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = product_before;
            product_before *= nums[i];
        }

        // int[] after = new int[nums.length];
        int product_after = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            ans[i] = ans[i] * product_after;
            // after[i] = product_after;
            product_after *= nums[i];
        }

        // for (int i = 0; i < nums.length; i++) {
        //     ans[i] = ans[i] * after[i];
        // }
        
        return ans;
    }
}  