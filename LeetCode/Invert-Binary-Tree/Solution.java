1class Solution {
2    public TreeNode invertTree(TreeNode root) {
3        if (root == null) return null;
4
5        TreeNode temp = root.left;
6        root.left = root.right;
7        root.right = temp;
8
9        invertTree(root.left);
10        invertTree(root.right);
11
12        return root;
13    }
14}