class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        java.util.Arrays.fill(first, -1);
        java.util.Arrays.fill(last, -1);
        
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (first[c] == -1) {
                first[c] = i;
            }
            last[c] = i;
        }
        
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (first[i] != -1 && last[i] - first[i] > 1) {
                boolean[] seen = new boolean[26];
                int uniqueCount = 0;
                for (int j = first[i] + 1; j < last[i]; j++) {
                    int mid = s.charAt(j) - 'a';
                    if (!seen[mid]) {
                        seen[mid] = true;
                        uniqueCount++;
                    }
                }
                ans += uniqueCount;
            }
        }
        
        return ans;
    }
}