class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int currentpro=1;
        int totelarr=0;
        int left=0;
        for(int r=0;r<nums.length;r++){
            currentpro*=nums[r];
            while(currentpro>=k){
                currentpro/=nums[left];
                left++;
            }
            totelarr+=(r-left+1);
            
        }
        return totelarr;
    }
}