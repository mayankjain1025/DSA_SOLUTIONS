class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        if(n==1){
            
        }
        else{
            int j=n-1;
            for(int i =0;i<=n-1;i++){
                if(nums[i]==0){
                    int temp = nums[i];
                    for(int k= i;k<j;k++){
                        nums[k]=nums[k+1];
                    }
                    i--;
                    nums[j]=temp;
                    j--;
                }
                if(i>=j){
                    break;
                }
            }
        }
    }
}