class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count characters of p
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            sCount[s.charAt(right) - 'a']++;

            // Keep window size equal to p.length()
            if (right - left + 1 > p.length()) {
                sCount[s.charAt(left) - 'a']--;
                left++;
            }

            // Compare frequency arrays
            if (Arrays.equals(pCount, sCount)) {
                ans.add(left);
            }
        }

        return ans;
    }
}