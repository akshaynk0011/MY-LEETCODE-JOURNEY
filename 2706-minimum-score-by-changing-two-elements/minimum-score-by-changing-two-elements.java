class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int first = nums[n - 1] - nums[2];

        int second = nums[n - 2] - nums[1];

        int third = nums[n - 3] - nums[0];

        return Math.min(first, Math.min(second, third));
    }
}