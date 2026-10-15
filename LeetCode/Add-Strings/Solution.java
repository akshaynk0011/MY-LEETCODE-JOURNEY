1class Solution {
2    public String addStrings(String num1, String num2) {
3        int i = num1.length() - 1;
4        int j = num2.length() - 1;
5
6        int carry = 0;
7        StringBuilder ans = new StringBuilder();
8
9        while (i >= 0 || j >= 0 || carry > 0) {
10            int sum = carry;
11
12            if (i >= 0) {
13                sum += num1.charAt(i) - '0';
14                i--;
15            }
16
17            if (j >= 0) {
18                sum += num2.charAt(j) - '0';
19                j--;
20            }
21
22            ans.append(sum % 10);
23            carry = sum / 10;
24        }
25
26        return ans.reverse().toString();
27    }
28}