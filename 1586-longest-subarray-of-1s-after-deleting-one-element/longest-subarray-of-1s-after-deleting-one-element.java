class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int zeros=0;
        int l=0;
        int len=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                zeros++;
            }
            if(zeros>1){
                len=Math.max(len, (r-l-1));
                while(zeros>1){
                    if(nums[l]==0){
                        zeros--;
                        l++;
                    }
                    else{l++;}
                }
            }
            else{len=Math.max(len, (r-l));}
            
        }
        return len;
    }
}