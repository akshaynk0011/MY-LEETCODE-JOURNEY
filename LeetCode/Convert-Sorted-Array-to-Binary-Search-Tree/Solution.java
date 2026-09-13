1class Solution {
2    public TreeNode sortedArrayToBST(int[] nums) {
3        return build(nums, 0, nums.length - 1);
4    }
5
6    private TreeNode build(int[] nums, int low, int high) {
7        if (low > high) return null;
8
9        int mid = low + (high - low) / 2;
10
11        TreeNode root = new TreeNode(nums[mid]);
12
13        root.left = build(nums, low, mid - 1);
14        root.right = build(nums, mid + 1, high);
15
16        return root;
17    }
18}