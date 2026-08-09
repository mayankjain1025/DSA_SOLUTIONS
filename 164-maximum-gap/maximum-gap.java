import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        // If all elements are the same, the gap is 0
        if (min == max) return 0;
        
        int n = nums.length;
        
        // Calculate the minimum possible maximum gap
        int bucketSize = (int) Math.ceil((double) (max - min) / (n - 1));
        
        // Number of buckets needed
        int bucketCount = (max - min) / bucketSize + 1;
        
        // Arrays to store the min and max values for each bucket
        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);
        
        // Put numbers into buckets
        for (int num : nums) {
            int idx = (num - min) / bucketSize;
            bucketMin[idx] = Math.min(bucketMin[idx], num);
            bucketMax[idx] = Math.max(bucketMax[idx], num);
        }
        
        // Iterate through the buckets to find the maximum gap
        int maxGap = 0;
        int prevMax = min;
        
        for (int i = 0; i < bucketCount; i++) {
            // Skip empty buckets
            if (bucketMin[i] == Integer.MAX_VALUE) continue;
            
            // Calculate the gap between the current bucket's min and the previous bucket's max
            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
            
            // Update prevMax for the next iteration
            prevMax = bucketMax[i];
        }
        
        return maxGap;
    }
}