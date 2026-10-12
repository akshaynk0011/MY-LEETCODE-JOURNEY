1class Solution {
2    public int countLargestGroup(int n) {
3        int[] count = new int[37];
4
5        int maxSize = 0;
6
7        for (int i = 1; i <= n; i++) {
8            int sum = digitSum(i);
9
10            count[sum]++;
11            maxSize = Math.max(maxSize, count[sum]);
12        }
13
14        int ans = 0;
15
16        for (int i = 1; i < count.length; i++) {
17            if (count[i] == maxSize) {
18                ans++;
19            }
20        }
21
22        return ans;
23    }
24
25    private int digitSum(int num) {
26        int sum = 0;
27
28        while (num > 0) {
29            sum += num % 10;
30            num /= 10;
31        }
32
33        return sum;
34    }
35}