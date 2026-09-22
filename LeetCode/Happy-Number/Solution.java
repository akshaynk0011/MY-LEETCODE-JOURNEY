1class Solution {
2    public boolean isHappy(int n) {
3        int slow = n;
4        int fast = n;
5
6        do {
7            slow = sumOfSquares(slow);
8            fast = sumOfSquares(sumOfSquares(fast));
9        } while (slow != fast);
10
11        return slow == 1;
12    }
13
14    private int sumOfSquares(int n) {
15        int sum = 0;
16
17        while (n > 0) {
18            int digit = n % 10;
19            sum += digit * digit;
20            n = n / 10;
21        }
22
23        return sum;
24    }
25}