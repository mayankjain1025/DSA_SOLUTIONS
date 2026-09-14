import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestWPI(int[] hours) {
        int maxLen = 0;
        int prefixSum = 0;
        // Stores the earliest index where a prefixSum was first seen
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < hours.length; i++) {
            // Step 1: Update prefix sum (+1 for tiring, -1 for non-tiring)
            prefixSum += (hours[i] > 8) ? 1 : -1;

            // Case 1: If prefixSum > 0, the entire subarray from index 0 to i is valid
            if (prefixSum > 0) {
                maxLen = i + 1;
            } else {
                // Case 2: Record the earliest occurrence of this prefixSum
                map.putIfAbsent(prefixSum, i);

                // Check if (prefixSum - 1) has been seen before.
                // A subarray sum of +1 is formed by prefixSum - (prefixSum - 1).
                if (map.containsKey(prefixSum - 1)) {
                    maxLen = Math.max(maxLen, i - map.get(prefixSum - 1));
                }
            }
        }

        return maxLen;
    }
}