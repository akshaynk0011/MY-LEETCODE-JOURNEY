1class Solution {
2    public int kthSmallest(TreeNode root, int k) {
3        Stack<TreeNode> stack = new Stack<>();
4        TreeNode node = root;
5
6        while (true) {
7            while (node != null) {
8                stack.push(node);
9                node = node.left;
10            }
11
12            node = stack.pop();
13            k--;
14
15            if (k == 0) {
16                return node.val;
17            }
18
19            node = node.right;
20        }
21    }
22}