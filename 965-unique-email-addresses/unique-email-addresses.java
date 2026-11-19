class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];

            int at = email.indexOf('@');

            String local = email.substring(0, at);
            String domain = email.substring(at);

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < local.length(); j++) {
                char ch = local.charAt(j);

                if (ch == '+') {
                    break;
                }

                if (ch != '.') {
                    sb.append(ch);
                }
            }

            String uniqueEmail = sb.toString() + domain;

            set.add(uniqueEmail);
        }

        return set.size();
    }
}