import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // Map stores: (remainder, frequency)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base Case: A remainder of 0 has occurred once before starting
        map.put(0, 1);
        
        int currentPrefixSum = 0;
        int count = 0;
        
        for (int num : nums) {
            currentPrefixSum += num;
            
            // Calculate remainder and normalize negative remainders
            int remainder = currentPrefixSum % k;
            if (remainder < 0) {
                remainder += k;
            }
            
            // If this remainder was seen before, add its frequency to total count
            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }
            
            // Store or update remainder frequency
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        
        return count;
    }
}