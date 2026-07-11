class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Store left products
        int left = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = left;
            left *= nums[i];
        }

        // Multiply with right products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}