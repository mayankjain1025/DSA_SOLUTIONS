class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0;
        int j=1;
        if(nums.length<2){
            return nums;
        }
        int [] arr= new int [nums.length];
        for(int k = 0; k<nums.length; k++){
            if (nums[k]>0){
                arr[i]=nums[k];
                i=i+2;
            }
            else{
                arr[j]=nums[k];
                j=j+2;
            }
        }
        return arr;
    }
}