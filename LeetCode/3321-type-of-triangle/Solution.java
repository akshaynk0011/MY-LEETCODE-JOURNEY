class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);

        // Check if a valid triangle can be formed
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }

        // All three sides are equal
        if (nums[0] == nums[2]) {
            return "equilateral";
        }

        // Exactly two sides are equal
        if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        }

        // All sides are different
        return "scalene";
    }
}