import java.util.HashMap;
import java.util.Map;

class Solution {
    public int getLargestOutlier(int[] nums) {
        int totalSum = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Step 1: Calculate the total sum and map the frequency of each element
        for (int num : nums) {
            totalSum += num;
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int maxOutlier = Integer.MIN_VALUE;
        
        // Step 2: Test every number as a potential outlier
        for (int outlier : nums) {
            int remainingSum = totalSum - outlier;
            
            // Rule 1: The remaining sum must be perfectly divisible by 2
            if (remainingSum % 2 == 0) {
                int targetSumElement = remainingSum / 2;
                
                // Rule 2: Check if the required target sum element exists in the map
                if (freqMap.containsKey(targetSumElement)) {
                    
                    // Edge Case Check: If the outlier and the target sum element are the 
                    // exact same number (e.g. [-702, -702]), that number must appear at least twice.
                    if (targetSumElement == outlier) {
                        if (freqMap.get(targetSumElement) >= 2) {
                            maxOutlier = Math.max(maxOutlier, outlier);
                        }
                    } else {
                        // Normal case: they are different numbers
                        maxOutlier = Math.max(maxOutlier, outlier);
                    }
                }
            }
        }
        
        return maxOutlier;
    }
}