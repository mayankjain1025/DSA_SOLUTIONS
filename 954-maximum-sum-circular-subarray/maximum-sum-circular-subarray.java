class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;

        int maxSum = Integer.MIN_VALUE;
        int currentMax = 0;

        int minSum = Integer.MAX_VALUE;
        int currentMin = 0;

        for (int num : nums) {
            totalSum += num;

            // 1. Standard Kadane's for maximum subarray
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // 2. Inverted Kadane's for minimum subarray
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
        }

        // Edge case: all numbers are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum of:
        // 1. Normal maximum subarray
        // 2. Circular/wrapped maximum subarray
        return Math.max(maxSum, totalSum - minSum);
    }
}