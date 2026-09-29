class Solution {
    // private int forward(int[] nums, int target){
    //     int sum=0;
    //     for(int r=0;r<n-1;r++){
    //         sum+=nums[r]
    //         if(target =nums[r]){
    //             count++;
    //         }
    //         if(sum ==target){
    //             count++;
    //         }
    //         if(sum>target){
    //             sum-= nums[l]
    //         }
    //     }
    // }
    // private int backward(int[] nums, int target){
    //     int sum=0;
    //     for(int r=n-1;r>0;r--){
    //         sum+=nums[r]
    //         // if(target =nums[r]){
    //         //     count++;
    //         // }
    //         if(sum ==target){
    //             count++;
    //         }
    //         if(sum>target){
    //             sum-= nums[l]
    //         }
    //     }
    // }
    // public int numSubarraysWithSum(int[] nums, int goal) { 
    //     int count=0;
    // return atMost(nums, goal) - atMost(nums, goal - 1);
    private int atMost(int[] nums, int target) {
        if (target < 0) return 0;
        int n= nums.length;
        int l=0;
        int sum=0;
        int count=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            
            while(sum>target){
                sum-=nums[l];
                l++;
            
            }
            count+=r-l+1;
            
        }
        return count; 
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
    return atMost(nums, goal) - atMost(nums, goal - 1);

    }

}