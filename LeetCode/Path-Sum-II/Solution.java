1class Solution {
2    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> path = new ArrayList<>();
5
6        solve(root, targetSum, path, ans);
7
8        return ans;
9    }
10
11    private void solve(TreeNode root, int targetSum,
12                       List<Integer> path,
13                       List<List<Integer>> ans) {
14
15        if (root == null) return;
16
17        path.add(root.val);
18        targetSum -= root.val;
19
20        if (root.left == null && root.right == null && targetSum == 0) {
21            ans.add(new ArrayList<>(path));
22        }
23
24        solve(root.left, targetSum, path, ans);
25        solve(root.right, targetSum, path, ans);
26
27        path.remove(path.size() - 1);
28    }
29}