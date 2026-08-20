import java.util.HashMap;

class Solution {
    public long countGood(int[] nums, int k) {
        long totalGoodSubarrays = 0;
        long currentPairs = 0;
        int left = 0;
        
        // Stores the frequency of elements in the current sliding window
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for (int right = 0; right < nums.length; right++) {
            int rightNum = nums[right];
            int count = freqMap.getOrDefault(rightNum, 0);
            
            // Adding a number increases the total pairs by its previous frequency
            currentPairs += count;
            freqMap.put(rightNum, count + 1);
            
            // Once the window has enough pairs, count all valid subarrays and shrink
            while (currentPairs >= k) {
                // If [left, right] is good, so is [left, right+1], [left, right+2], etc.
                totalGoodSubarrays += (nums.length - right);
                
                int leftNum = nums[left];
                int leftCount = freqMap.get(leftNum);
                
                // Removing a number decreases the total pairs by its new remaining frequency
                currentPairs -= (leftCount - 1);
                freqMap.put(leftNum, leftCount - 1);
                
                left++;
            }
        }
        
        return totalGoodSubarrays;
    }
}