class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int maxsize=0;
    int count=0;
    int n=nums.length;
    for(int i=0; i<n;i++){
        if(nums[i]==1){
            count++;
        }
        else if(nums[i]==0){
            if(count>maxsize){
                maxsize= count;
                count=0;
            }
            count=0;
        }
        
    }
    if(count>maxsize){
        maxsize= count;
        count=0;
    }
    return maxsize;
    }
}