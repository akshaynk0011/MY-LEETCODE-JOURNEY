1class Solution {
2    public boolean isUgly(int n) {
3        if (n <= 0) return false;
4
5        while (n % 2 == 0) {
6            n = n / 2;
7        }
8
9        while (n % 3 == 0) {
10            n = n / 3;
11        }
12
13        while (n % 5 == 0) {
14            n = n / 5;
15        }
16
17        return n == 1;
18    }
19}