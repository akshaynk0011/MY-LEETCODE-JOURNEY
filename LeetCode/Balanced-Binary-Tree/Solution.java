1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        return height(root) != -1;
4    }
5
6    private int height(TreeNode root) {
7        if (root == null) return 0;
8
9        int left = height(root.left);
10        if (left == -1) return -1;
11
12        int right = height(root.right);
13        if (right == -1) return -1;
14
15        if (Math.abs(left - right) > 1) {
16            return -1;
17        }
18
19        return 1 + Math.max(left, right);
20    }
21}