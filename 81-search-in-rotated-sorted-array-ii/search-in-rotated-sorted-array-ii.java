class Solution {
    public boolean search(int[] nums, int target) { //self ninary search eqal case [1, 0, 1, 1, 1]
    int l=0; int r=nums.length-1;
        while (l<=r){
            int mid= l+(r-l)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]== nums[l] && nums[mid]==nums[r]){
                l++;r--;
                continue;
            }
            if(nums[l]<=nums[mid]){
                if(nums[l]<=target && nums[mid]>target){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(nums[mid]<target && target <=nums[r]){
                    l=mid+1;
                }
                else{
                    r= mid-1;
                }
            }
        }
        return false;
        // int low = 0;
        // int high = nums.length - 1;

        // while (low <= high) {

        //     int mid = low + (high - low) / 2;
        
        //     if (nums[mid] == target) {
        //         return true;
        //     }
        //     if(nums[low]==nums[mid] && nums[mid]==nums[high]){
        //         low++;
        //         high--;
        //         continue;
                
        //     }
        //     // Check if LEFT half is sorted
        //     if (nums[low] <= nums[mid]) {
        //         if (nums[low] <= target && target < nums[mid]) {
        //             high = mid - 1;
        //         } else {
        //             low = mid + 1;
        //         }

        //     } 
            
        //     // RIGHT half must be sorted
        //     else {

        //         // Target lies inside the right sorted half
        //         if (nums[mid] < target && target <= nums[high]) {
        //             low = mid + 1;
        //         } else {
        //             high = mid - 1;
        //         }
        //     }
        // }
    // return false;       
        
    }
}