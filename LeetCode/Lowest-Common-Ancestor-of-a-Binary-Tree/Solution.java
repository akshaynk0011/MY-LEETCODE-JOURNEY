1class Solution {
2    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
3        if (root == null || root == p || root == q) {
4            return root;
5        }
6
7        TreeNode left = lowestCommonAncestor(root.left, p, q);
8        TreeNode right = lowestCommonAncestor(root.right, p, q);
9
10        if (left != null && right != null) {
11            return root;
12        }
13
14        if (left != null) {
15            return left;
16        }
17
18        return right;
19    }
20}