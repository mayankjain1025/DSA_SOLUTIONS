class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long minTime = Long.MAX_VALUE;
        for (int t : time) {
            minTime = Math.min(minTime, t);
        }
        long r=minTime * totalTrips;
        long l=1;   //Integer.MAX_VALUE;
        long ans=r;
        for(int t :time){
            l=  Math.min(t,l);
            r= Math.max(t,r) ;
        }
        r=r*totalTrips;
        while(l<=r){
            long mid=l+(r-l)/2;
            long rounds=0;
            for(int t: time){
                rounds+=mid/t;
            }
            if(rounds>=totalTrips){
                r=mid-1;
                ans=mid;
            }
            else{
                l= mid+1;
            }

        }
        return ans;
    }
}