class Solution {
    public String countAndSay(int n) {
        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder nextResult = new StringBuilder();
            int count = 1;

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    nextResult.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }
            nextResult.append(count).append(result.charAt(result.length() - 1));
            result = nextResult.toString();
        }

        return result;
    }
}