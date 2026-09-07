1class Solution {
2    int diameter = 0;
3
4    public int diameterOfBinaryTree(TreeNode root) {
5        height(root);
6        return diameter;
7    }
8
9    private int height(TreeNode root) {
10        if (root == null) return 0;
11
12        int left = height(root.left);
13        int right = height(root.right);
14
15        diameter = Math.max(diameter, left + right);
16
17        return 1 + Math.max(left, right);
18    }
19}