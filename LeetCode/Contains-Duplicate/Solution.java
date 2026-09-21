1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            if (set.contains(nums[i])) {
7                return true;
8            }
9
10            set.add(nums[i]);
11        }
12
13        return false;
14    }
15}