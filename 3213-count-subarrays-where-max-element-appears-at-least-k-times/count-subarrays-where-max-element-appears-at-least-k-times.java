class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int count =0;
        long subcount=0;
        for(int r=0; r<nums.length; r++){
            if(nums[r]==max){
                count++;
            }
            // if(count>=k){
            //     subcount+=r-l+1;
            // }
            while(count>=k){
                subcount+=nums.length-r;
                if(nums[l]==max){
                    count--;
                }
                l++;
            }
            // subcount+=nums.length-r;
        }
        return subcount;
    }
}