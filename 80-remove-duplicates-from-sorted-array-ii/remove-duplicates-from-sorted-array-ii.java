class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            // Check if it's the very first element, OR a new number
            if (j == 0 || nums[i] != nums[j - 1]) {
                count = 1;          // Reset count to 1 for the new number
                nums[j] = nums[i];  // Place the new number
                j++;                // Move destination pointer
            } 
            // Otherwise, it's a duplicate. Only add it if count is less than 2
            else if (count < 2) {
                count++;            // Increment our duplicate counter
                nums[j] = nums[i];  // Place the allowed duplicate
                j++;                // Move destination pointer
            }
        }
        
        return j;
    }
}