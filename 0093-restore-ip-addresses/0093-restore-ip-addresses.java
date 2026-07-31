class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();

        // Impossible lengths
        if (s.length() < 4 || s.length() > 12)
            return result;

        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int index, List<String> path, List<String> result) {

        // If we already have 4 parts
        if (path.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", path));
            }
            return;
        }

        // Try taking 1, 2, or 3 digits
        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {

            String part = s.substring(index, index + len);

            // Leading zero check
            if (part.length() > 1 && part.charAt(0) == '0')
                break;

            int num = Integer.parseInt(part);

            // Value should be <=255
            if (num > 255)
                break;

            path.add(part);
            backtrack(s, index + len, path, result);
            path.remove(path.size() - 1); // Backtrack
        }
    }
}