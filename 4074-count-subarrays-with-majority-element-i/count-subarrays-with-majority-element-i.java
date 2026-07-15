class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        // int targetcount=0;
        int count_subarray=0;

        for(int r=0;r<n;r++){
            int targetcount=0;
            for(int j=r;j<n;j++){
                if (nums[j]==target){
                    targetcount++;
                }
                if(((j-r)+1)/2<targetcount){
                    count_subarray++;
                
                }
            }
            // else{l++;}
        }
        // for(int l=0;l<n;l++){
        //     if nums[l]==target{
        //         targetcount--;
        //     }
        //     if(((n-1)-l+1)/2)==count){
        //         count_subarray++;
        //     }
        //     // else{l++;}
        // }
        return count_subarray;
    }
}