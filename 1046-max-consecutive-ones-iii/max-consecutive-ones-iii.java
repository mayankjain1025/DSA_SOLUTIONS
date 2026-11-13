class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int zero=0;
        int l=0;
        int maxlen=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                zero++;
            }
            if(zero<=k){
                maxlen=Math.max(maxlen , r-l+1);
            }
            if(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
        }
        return maxlen;









        // int n=nums.length;
        // int l=0;
        // int zeros=0;
        // int maxlen=0;
        // for(int r=0;r<n;r++){
        //     if(nums[r]==0){
        //         zeros++;
        //     }
        //     if(zeros<=k){
        //         int len =r-l+1;
        //         maxlen=Math.max(maxlen,len);
        //     }
        //     if(zeros>k){
        //         if(nums[l]==0){
        //             zeros--;
        //         }
        //         l++;
        //     }
            
        // }
        // return maxlen;
    }
}