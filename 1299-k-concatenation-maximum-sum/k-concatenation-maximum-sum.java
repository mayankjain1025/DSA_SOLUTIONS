class Solution {
    static final int MOD = 1_000_000_007;

    // Standard Kadane's Algorithm
    private long kadane(int[] nums) {
        long maxSum = 0;
        long currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public int kConcatenationMaxSum(int[] arr, int k) {

        // Case 1: k = 1
        if (k == 1) {
            return (int) (kadane(arr) % MOD);
        }

        long totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        // Create arr + arr
        int n = arr.length;
        int[] doubleArr = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            doubleArr[i] = arr[i % n];
        }

        // Maximum subarray sum in two concatenated arrays
        long maxTwoConcat = kadane(doubleArr);

        // Case 2: Total sum is positive
        if (totalSum > 0) {
            long ans = maxTwoConcat + totalSum * (k - 2);
            return (int) (ans % MOD);
        }

        // Case 3: Total sum is zero or negative
        return (int) (maxTwoConcat % MOD);
    }
}