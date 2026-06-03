class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return true;
        }
        
        int loc = 0;
        boolean sorted = true;
        
        // FIX 1: Find the actual "drop" to handle duplicate minimums safely
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                loc = i + 1; // This is the true start of the rotated array
                break;
            }
        }
        
        // FIX 2: If no drop was found, the array is perfectly sorted already
        if (loc == 0) {
            return true;
        }
        
        int j = loc;
        
        // Your exact circular checking logic:
        while (j != loc - 1) {
            if (j >= n) {
                j = 0;
            }
            if (j == loc - 1) {
                break;
            }
            if (nums[j] <= nums[(j + 1) % n]) {
                sorted = true;
            } else {
                return false;
            }
            j++;
        }
        return sorted;
    }
}