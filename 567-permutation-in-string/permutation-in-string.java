class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int n = s2.length();
        if (k > n) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < k; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) {
                matches++;
            }
        }

        for (int right = k; right < n; right++) {
            if (matches == 26) {
                return true;
            }

            int inIdx = s2.charAt(right) - 'a';
            int outIdx = s2.charAt(right - k) - 'a';

            // Process incoming character
            s2Count[inIdx]++;
            if (s2Count[inIdx] == s1Count[inIdx]) {
                matches++;
            } else if (s2Count[inIdx] == s1Count[inIdx] + 1) {
                matches--;
            }

            // Process outgoing character
            s2Count[outIdx]--;
            if (s2Count[outIdx] == s1Count[outIdx]) {
                matches++;
            } else if (s2Count[outIdx] == s1Count[outIdx] - 1) {
                matches--;
            }
        }

        return matches == 26;
    }
}