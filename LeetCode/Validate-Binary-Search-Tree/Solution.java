1class Solution {
2    public boolean isValidBST(TreeNode root) {
3        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
4    }
5
6    private boolean check(TreeNode root, long min, long max) {
7        if (root == null) return true;
8
9        if (root.val <= min || root.val >= max) {
10            return false;
11        }
12
13        return check(root.left, min, root.val)
14            && check(root.right, root.val, max);
15    }
16}