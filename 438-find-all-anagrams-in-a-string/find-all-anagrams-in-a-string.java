import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        if (p.length() > s.length()) {
            return new ArrayList<>();
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        List<Integer> result = new ArrayList<>();

        // Step 1: Count target frequencies
        // and initialize the first window
        for (int i = 0; i < p.length(); i++) {

            pCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }

        // Check if the first window is an anagram
        if (Arrays.equals(pCount, windowCount)) {
            result.add(0);
        }

        // Step 2: Slide the window
        int k = p.length();

        for (int i = k; i < s.length(); i++) {

            // Add incoming character on the right
            windowCount[s.charAt(i) - 'a']++;

            // Remove outgoing character on the left
            windowCount[s.charAt(i - k) - 'a']--;

            // Check if frequency arrays match
            if (Arrays.equals(pCount, windowCount)) {

                // Start index of current window
                result.add(i - k + 1);
            }
        }

        return result;
    }
}