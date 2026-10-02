class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int product=1;
        int n= nums.length;
        int count=0;
        int l=0;
        for(int i=0;i<n;i++){
            product*=nums[i];
            while(product>=k){
                product=product/nums[l];
                l++;
            }
            count+=i-l+1;
        }
        return count ;







        // int currentpro=1;
        // int totelarr=0;
        // int left=0;
        // for(int r=0;r<nums.length;r++){
        //     currentpro*=nums[r];
        //     while(currentpro>=k){
        //         currentpro/=nums[left];
        //         left++;
        //     }
        //     totelarr+=(r-left+1);
            
        // }
        // return totelarr;
    }
}