class Solution {
    private boolean valid(int [] weights , int days , int capacity){
        int requiredDays = 1;
        int currentWeight = 0;

        for (int w : weights) {

            if (currentWeight + w > capacity) {
                requiredDays++;
                currentWeight = 0;
            }

            currentWeight += w;
        }

        return requiredDays <= days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int l=1;
        int r=0;
        for(int w : weights){
            l = Math.max(l, w);
            r+=w;
        }
        int ans=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(valid(weights , days, mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}