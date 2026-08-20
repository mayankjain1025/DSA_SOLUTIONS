class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int max_count = 0;
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int k = i;
                    int l = j; 
                    int count = 0;
                    
                    // Check boundaries BEFORE accessing the array elements
                    while (k < nums1.length && l < nums2.length && nums1[k] == nums2[l]) {
                        count++;
                        k++;
                        l++;
                    }
                    max_count = Math.max(max_count, count);
                }
            }
        }
        return max_count;
    }
}


















// class Solution {
//     public int findLength(int[] nums1, int[] nums2) {
//         int max_count=0;
//         for(int i=0;i<nums1.length;i++){
//             int j=0;
//             int count=0;
//             while(nums1[i]!=nums2[j]){
//                 j++;
//             }
//             if (j>nums2.length-1){
//                 continue;
//             }
            
//             while(nums1[i]==nums2[j]){
//                 int k=i;
//                 count++;
//                 k++;
//                 j++;
//             }
//             max_count= Math.max(max_count, count);
//         }
//         return max_count;
//     }
// }