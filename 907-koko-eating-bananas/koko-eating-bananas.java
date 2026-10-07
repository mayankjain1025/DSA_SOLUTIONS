class Solution {
    private boolean vaild(int [] piles , int h , int speed){
        long hour=0;
        for(int p : piles ){
            hour+= (p + speed -1)/speed;
            if(hour >h){
                return false;
            }
            
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int p:piles){
            r= Math.max(p , r);
        }
        while(l<r){
            int mid=l+(r-l)/2;
            if(vaild(piles,h,mid)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}