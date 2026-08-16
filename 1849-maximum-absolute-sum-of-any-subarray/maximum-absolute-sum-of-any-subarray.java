class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxSum = 0;
        int minSum = 0;

        int curMax = 0;
        int curMin = 0;

        for (int x : nums) {

            // Track maximum subarray sum
            curMax = Math.max(x, curMax + x);
            maxSum = Math.max(maxSum, curMax);

            // Track minimum subarray sum
            curMin = Math.min(x, curMin + x);
            minSum = Math.min(minSum, curMin);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}