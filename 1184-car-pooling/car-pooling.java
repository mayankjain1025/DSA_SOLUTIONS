class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int [] diff=new int[1001];
        for(int []trip : trips){
            int from=trip[1];
            int to = trip[2];
            int passengers=trip[0];
            diff[from]+=passengers;
            diff[to]-=passengers;
        }
        int currentpassengers=0;
        for(int i:diff){
            currentpassengers+=i;
            if(currentpassengers>capacity){
                return false;
            }
        }
        return true;
    }
}