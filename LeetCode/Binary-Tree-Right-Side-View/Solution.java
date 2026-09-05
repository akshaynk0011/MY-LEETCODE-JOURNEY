1class Solution {
2    public List<Integer> rightSideView(TreeNode root) {
3        List<Integer> ans = new ArrayList<>();
4
5        if (root == null) return ans;
6
7        Queue<TreeNode> q = new LinkedList<>();
8        q.add(root);
9
10        while (!q.isEmpty()) {
11            int size = q.size();
12
13            for (int i = 0; i < size; i++) {
14                TreeNode node = q.poll();
15
16                if (i == size - 1) {
17                    ans.add(node.val);
18                }
19
20                if (node.left != null) q.add(node.left);
21                if (node.right != null) q.add(node.right);
22            }
23        }
24
25        return ans;
26    }
27}