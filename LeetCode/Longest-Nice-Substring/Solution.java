1class Solution {
2    public String longestNiceSubstring(String s) {
3        String ans = "";
4
5        for (int i = 0; i < s.length(); i++) {
6            boolean[] lower = new boolean[26];
7            boolean[] upper = new boolean[26];
8
9            for (int j = i; j < s.length(); j++) {
10                char ch = s.charAt(j);
11
12                if (Character.isLowerCase(ch)) {
13                    lower[ch - 'a'] = true;
14                } else {
15                    upper[ch - 'A'] = true;
16                }
17
18                if (isNice(lower, upper)) {
19                    if (j - i + 1 > ans.length()) {
20                        ans = s.substring(i, j + 1);
21                    }
22                }
23            }
24        }
25
26        return ans;
27    }
28
29    private boolean isNice(boolean[] lower, boolean[] upper) {
30        for (int i = 0; i < 26; i++) {
31            if (lower[i] != upper[i]) {
32                return false;
33            }
34        }
35
36        return true;
37    }
38}