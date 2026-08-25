class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length; 
        // if(n==1){
        //     return 0;
        // }
        int l = 0; 
        int r = n;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;

        // old approch 
        // if (target <= nums[0]) {
        //     return 0;
        // }

        // while (l < n - 1) {
        //     if (nums[l] == target) { 
        //         return l; 
        //     } 
        //     if (nums[l] < target && nums[r] >= target) {
        //         return r; 
        //     } 
        //     l++; 
        //     r++; 
        // } 
        // return n; 
    } 
}