1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4
5        // Mark numbers that are present
6        for (int i = 0; i < nums.length; i++) {
7            int index = Math.abs(nums[i]) - 1;
8            nums[index] = -Math.abs(nums[index]);
9        }
10
11        // Positive means the number is missing
12        for (int i = 0; i < nums.length; i++) {
13            if (nums[i] > 0) {
14                ans.add(i + 1);
15            }
16        }
17
18        return ans;
19    }
20}