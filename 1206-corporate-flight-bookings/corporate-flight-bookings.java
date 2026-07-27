class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff=new int[n];
        for(int [] booking :bookings ){
            int l=booking[0]-1;
            int r=booking[1]-1;
            int seats = booking[2];

            diff[l]+=seats;
            if(r+1<n){
                diff[r+1]-=seats;
            } 
        }
        int [] result =new int[n];
        result[0]=diff[0];
        for(int i=1;i<n;i++){
            result[i]=result[i-1]+diff[i];
        }
        return result;
    }
}