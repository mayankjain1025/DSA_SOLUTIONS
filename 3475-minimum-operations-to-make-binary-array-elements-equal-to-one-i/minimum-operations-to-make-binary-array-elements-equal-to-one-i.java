class Solution {
    public int minOperations(int[] nums) {
        int n= nums.length;
        int sum=0;
        int opr=0;
        // for(int i=0;i<3;i++){
        //     sum+=nums[i];
        // }
        if (nums[0]==0){
            opr++;
            for(int i=0;i<3;i++){
                if(nums[i]==1){
                    nums[i]=0;
                }
                else{
                    nums[i]=1;
                }
            }
        }
        int l=1;
        for(int r=3;r<n;r++){
            // sum-=nums[l];
            
            // sum+=nums[r];
            if (nums[l]==0){
                opr++;
                for(int i=l;i<=r;i++){
                    if(nums[i]==1){
                        nums[i]=0;
                    }
                    else{
                        nums[i]=1;
                    }
                }
            }
            l++;
        }
        int sumcheak=0;
        for(int i=0;i<n;i++){
            sumcheak+=nums[i];
        }
        if(sumcheak==n){
            return opr;
        }
        else {return-1;}
        // return -1; 
    }
}