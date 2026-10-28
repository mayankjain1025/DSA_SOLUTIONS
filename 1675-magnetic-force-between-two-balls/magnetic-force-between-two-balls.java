class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        int ans=0;
        Arrays.sort(position);
        int l=1;
        int r=position[n-1]-position[0];
        while(l<=r){
            int mid=l+(r-l)/2;
            if(canplace(position, m , mid)){
                ans = mid;       // Valid distance
                l = mid + 1;   // Try a larger distance 
            }
            else{
                r = mid - 1;  // Distance is too large
            }
        }
        return ans;
    }
    private boolean canplace(int [] position , int m , int mid  ){
        int lastplaced=position[0];
        int count = 1;
        for(int i=0;i<position.length;i++){
            if(position[i]-lastplaced>=mid){
                count++;
                lastplaced = position[i];

                if (count >= m) {
                    return true;
                }
            }            
        }
          return false;
    }
}