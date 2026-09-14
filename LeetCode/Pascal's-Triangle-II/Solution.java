1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> ans = new ArrayList<>();
4
5        long value = 1;
6
7        for (int i = 0; i <= rowIndex; i++) {
8            ans.add((int) value);
9
10            value = value * (rowIndex - i) / (i + 1);
11        }
12
13        return ans;
14    }
15}