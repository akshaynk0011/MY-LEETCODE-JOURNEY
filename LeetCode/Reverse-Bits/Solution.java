1public class Solution {
2    public int reverseBits(int n) {
3        int ans = 0;
4
5        for (int i = 0; i < 32; i++) {
6            ans = ans << 1;
7            ans = ans | (n & 1);
8
9            n = n >> 1;
10        }
11
12        return ans;
13    }
14}