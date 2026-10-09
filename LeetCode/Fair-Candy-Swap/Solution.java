1class Solution {
2    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
3        int sumA = 0;
4        int sumB = 0;
5
6        for (int i = 0; i < aliceSizes.length; i++) {
7            sumA += aliceSizes[i];
8        }
9
10        for (int i = 0; i < bobSizes.length; i++) {
11            sumB += bobSizes[i];
12        }
13
14        int diff = (sumB - sumA) / 2;
15
16        HashSet<Integer> set = new HashSet<>();
17
18        for (int i = 0; i < bobSizes.length; i++) {
19            set.add(bobSizes[i]);
20        }
21
22        for (int i = 0; i < aliceSizes.length; i++) {
23            int a = aliceSizes[i];
24            int b = a + diff;
25
26            if (set.contains(b)) {
27                return new int[]{a, b};
28            }
29        }
30
31        return new int[0];
32    }
33}