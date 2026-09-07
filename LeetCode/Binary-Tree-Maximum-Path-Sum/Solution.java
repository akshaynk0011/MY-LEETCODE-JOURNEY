1class Solution {
2    int maxSum = Integer.MIN_VALUE;
3
4    public int maxPathSum(TreeNode root) {
5        findMax(root);
6        return maxSum;
7    }
8
9    private int findMax(TreeNode root) {
10        if (root == null) return 0;
11
12        int left = Math.max(0, findMax(root.left));
13        int right = Math.max(0, findMax(root.right));
14
15        maxSum = Math.max(maxSum, left + right + root.val);
16
17        return root.val + Math.max(left, right);
18    }
19}