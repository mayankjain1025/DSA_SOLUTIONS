
class Solution {

    public int minimumTimeToInitialState(String word, int k) {

        int n = word.length();

        int[] z = new int[n];

        // Step 1: Build Z-array
        int L = 0;
        int R = 0;

        for (int i = 1; i < n; i++) {

            // Reuse previous Z-box information
            if (i <= R) {
                z[i] = Math.min(R - i + 1, z[i - L]);
            }

            // Extend the match
            while (i + z[i] < n &&
                   word.charAt(z[i]) ==
                   word.charAt(i + z[i])) {

                z[i]++;
            }

            // Update Z-box
            if (i + z[i] - 1 > R) {
                L = i;
                R = i + z[i] - 1;
            }
        }

        // Step 2: Check only multiples of k
        for (int i = k; i < n; i += k) {

            if (z[i] == n - i) {
                return i / k;
            }
        }

        // Step 3: All original characters can be removed
        return (n + k - 1) / k;
    }
}
