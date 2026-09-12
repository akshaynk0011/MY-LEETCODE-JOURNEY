1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        if (root == null) return true;
4
5        return check(root.left, root.right);
6    }
7
8    private boolean check(TreeNode left, TreeNode right) {
9        if (left == null && right == null) return true;
10
11        if (left == null || right == null) return false;
12
13        if (left.val != right.val) return false;
14
15        return check(left.left, right.right)
16            && check(left.right, right.left);
17    }
18}