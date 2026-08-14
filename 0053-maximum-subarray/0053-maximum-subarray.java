class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // either start new subarray or continue
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // update max
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}