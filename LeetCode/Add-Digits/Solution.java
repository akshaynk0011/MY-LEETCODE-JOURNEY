1class Solution {
2    public int addDigits(int num) {
3        if (num == 0) return 0;
4
5        return 1 + (num - 1) % 9;
6    }
7}