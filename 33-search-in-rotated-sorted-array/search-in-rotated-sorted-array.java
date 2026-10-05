class Solution {
    public int search(int[] nums, int target) {
        int l=0; int r=nums.length-1;
        while (l<=r){
            int mid= l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
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
        return -1;
    }
}

// class Solution {
//     public int search(int[] nums, int target) {

//         int low = 0;
//         int high = nums.length - 1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             // Target found
//             if (nums[mid] == target) {
//                 return mid;
//             }

//             // Check if LEFT half is sorted
//             if (nums[low] <= nums[mid]) {

//                 // Target lies inside the left sorted half
//                 if (nums[low] <= target && target < nums[mid]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }

//             } 
            
//             // RIGHT half must be sorted
//             else {

//                 // Target lies inside the right sorted half
//                 if (nums[mid] < target && target <= nums[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }
//         }

//         return -1;
//     }
// }