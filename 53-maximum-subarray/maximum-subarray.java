class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize both variables to the first element
        // This naturally handles the "all negative" edge case
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Start iterating from the second element
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // The core Kadane's decision: extend or start fresh?
            currentSum = Math.max(num, currentSum + num);

            // Update the global maximum sum seen so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}