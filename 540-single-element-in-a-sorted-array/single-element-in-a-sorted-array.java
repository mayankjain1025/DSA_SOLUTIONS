
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Align mid with the first index of a pair
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                // Pair is intact: single element is on the right
                left = mid + 2;
            } else {
                // Pair is broken: answer is at mid or to the left
                right = mid;
            }
        }

        return nums[left];
    }
}
