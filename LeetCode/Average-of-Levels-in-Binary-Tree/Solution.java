1class Solution {
2    public List<Double> averageOfLevels(TreeNode root) {
3        List<Double> ans = new ArrayList<>();
4
5        if (root == null) return ans;
6
7        Queue<TreeNode> q = new LinkedList<>();
8        q.add(root);
9
10        while (!q.isEmpty()) {
11            int size = q.size();
12            long sum = 0;
13
14            for (int i = 0; i < size; i++) {
15                TreeNode node = q.poll();
16
17                sum += node.val;
18
19                if (node.left != null) q.add(node.left);
20                if (node.right != null) q.add(node.right);
21            }
22
23            ans.add((double) sum / size);
24        }
25
26        return ans;
27    }
28}