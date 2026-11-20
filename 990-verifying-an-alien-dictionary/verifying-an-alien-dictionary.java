class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] position = new int[26];

        // Store character positions
        for (int i = 0; i < order.length(); i++) {
            position[order.charAt(i) - 'a'] = i;
        }

        // Compare adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];

            int len = Math.min(s1.length(), s2.length());

            boolean foundDifference = false;

            for (int j = 0; j < len; j++) {
                char ch1 = s1.charAt(j);
                char ch2 = s2.charAt(j);

                if (ch1 != ch2) {
                    if (position[ch1 - 'a'] > position[ch2 - 'a']) {
                        return false;
                    }

                    foundDifference = true;
                    break;
                }
            }

            // Check prefix condition
            if (!foundDifference && s1.length() > s2.length()) {
                return false;
            }
        }

        return true;
    }
}