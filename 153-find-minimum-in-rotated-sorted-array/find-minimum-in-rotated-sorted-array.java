class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If the mid element is strictly greater than the rightmost element,
            // it means the array wraps around in the right half. 
            // The minimum must be strictly to the right of mid.
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // Otherwise, the right side is properly sorted.
            // The minimum must be in the left half, OR it is the mid element itself.
            else {
                right = mid;
            }
        }
        
        // When left == right, we have narrowed down to the minimum element
        return nums[left];
    }
}