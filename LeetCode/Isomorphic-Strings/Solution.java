1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        int[] mapS = new int[256];
4        int[] mapT = new int[256];
5
6        for (int i = 0; i < s.length(); i++) {
7            char a = s.charAt(i);
8            char b = t.charAt(i);
9
10            if (mapS[a] != mapT[b]) {
11                return false;
12            }
13
14            mapS[a] = i + 1;
15            mapT[b] = i + 1;
16        }
17
18        return true;
19    }
20}