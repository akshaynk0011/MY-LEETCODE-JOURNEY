1class Solution {
2    public int maximum69Number(int num) {
3        char[] arr = String.valueOf(num).toCharArray();
4
5        for (int i = 0; i < arr.length; i++) {
6            if (arr[i] == '6') {
7                arr[i] = '9';
8                break;
9            }
10        }
11
12        return Integer.parseInt(new String(arr));
13    }
14}