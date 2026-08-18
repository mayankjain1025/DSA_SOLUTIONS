import java.util.TreeSet;

class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int globalMax = Integer.MIN_VALUE;

        // Iterate over left column boundary
        for (int left = 0; left < cols; left++) {
            int[] rowSums = new int[rows];

            // Expand right column boundary
            for (int right = left; right < cols; right++) {
                // Compress columns into 1D row sums
                for (int r = 0; r < rows; r++) {
                    rowSums[r] += matrix[r][right];
                }

                // Find max subarray sum <= k using TreeSet
                TreeSet<Integer> prefixSums = new TreeSet<>();
                prefixSums.add(0);
                int currentSum = 0;

                for (int sum : rowSums) {
                    currentSum += sum;
                    // Find the smallest prefix sum such that: currentSum - prefixSum <= k
                    // -> prefixSum >= currentSum - k
                    Integer target = prefixSums.ceiling(currentSum - k);
                    if (target != null) {
                        globalMax = Math.max(globalMax, currentSum - target);
                    }
                    prefixSums.add(currentSum);
                }

                // Early exit if we already found exact match
                if (globalMax == k) return k;
            }
        }

        return globalMax;
    }
}