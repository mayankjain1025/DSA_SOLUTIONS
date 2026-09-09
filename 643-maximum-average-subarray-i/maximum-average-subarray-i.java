class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        // int l=0;
        // int r=k-1;
        // double sum=0;
        // for(int i=0;i<=k-1;i++){
        //     sum=sum+nums[i];
        // }
        // double maxavg=sum/k;
        // double avg=0;
        // while(r<n-1){
        //     sum=sum-nums[l];
        //     l++;
        //     r++;
        //     sum=sum+nums[r];
        //     avg=sum/k;
        //     if(avg>maxavg){
        //         maxavg=avg;
        //     }
            
        // }   
        // return maxavg;\
        int maxsum=0;
        int sum =0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            maxsum= sum;
        }
        int l=0;  
        for(int r=k;r<n;r++){
            
            sum-=nums[l];l++;
            sum+=nums[r];;
            maxsum= Math.max(sum,maxsum);
        }
        return (double)maxsum/k;
    }
}


















