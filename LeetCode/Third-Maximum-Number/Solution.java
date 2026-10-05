1class Solution {
2    public int thirdMax(int[] nums) {
3        long first = Long.MIN_VALUE;
4        long second = Long.MIN_VALUE;
5        long third = Long.MIN_VALUE;
6
7        for (int i = 0; i < nums.length; i++) {
8            long num = nums[i];
9
10            // Skip duplicate
11            if (num == first || num == second || num == third) {
12                continue;
13            }
14
15            if (num > first) {
16                third = second;
17                second = first;
18                first = num;
19            } 
20            else if (num > second) {
21                third = second;
22                second = num;
23            } 
24            else if (num > third) {
25                third = num;
26            }
27        }
28
29        if (third == Long.MIN_VALUE) {
30            return (int) first;
31        }
32
33        return (int) third;
34    }
35}