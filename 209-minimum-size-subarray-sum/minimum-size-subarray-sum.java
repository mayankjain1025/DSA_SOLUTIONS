class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int l=0;
        int min=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>=target){
                min=Math.min(min,r-l+1);
                // if(sum>target){
                sum-=nums[l];
                    l++;
                
            }
            
        }
        return min==Integer.MAX_VALUE?0:min;
       
       
       
       
       
       
       
       
        // int n=nums.length;
        // int l=0;
        // int sum=0;
        // int mini=Integer.MAX_VALUE;
        // for(int r=0;r<n;r++){
        //     sum+=nums[r];
        //     while(sum>=target){
        //         int len=r-l+1;
        //         mini=Math.min(mini,len);
            
        //         sum-=nums[l];
        //         l++;
        //     }
        // }
        // return mini== Integer.MAX_VALUE ? 0 : mini;
    }
}