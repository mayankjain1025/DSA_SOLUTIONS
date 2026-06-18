class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            // while(nums[l]!=val){l++;}
            if(nums[l]==val){
                // int tep=nums[r];
                nums[l]=nums[r];
                // nums[l]=tep;
                r--;
                k++;
            }
            else{l++;}
        }
        return l;
    }
}