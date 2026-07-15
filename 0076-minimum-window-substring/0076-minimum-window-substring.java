class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] count = new int[128];

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        int required = t.length();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Needed character found
            if (count[ch] > 0) {
                required--;
            }

            count[ch]--;

            // Valid window found
            while (required == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                count[leftChar]++;

                if (count[leftChar] > 0) {
                    required++;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}