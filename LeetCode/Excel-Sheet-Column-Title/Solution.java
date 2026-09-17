1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder ans = new StringBuilder();
4
5        while (columnNumber > 0) {
6            columnNumber--;
7
8            int remainder = columnNumber % 26;
9
10            ans.append((char) ('A' + remainder));
11
12            columnNumber = columnNumber / 26;
13        }
14
15        return ans.reverse().toString();
16    }
17}