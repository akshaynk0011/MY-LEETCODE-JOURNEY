1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        if (num <= 1) {
4            return false;
5        }
6
7        int sum = 1;
8
9        for (int i = 2; i <= num / i; i++) {
10            if (num % i == 0) {
11                sum += i;
12
13                int other = num / i;
14
15                if (other != i) {
16                    sum += other;
17                }
18            }
19        }
20
21        return sum == num;
22    }
23}