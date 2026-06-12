class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int jn=accounts[0].length;
        int max= 0;
        // int sum = 0;
        for(int i = 0; i<n;i++){
            int sum = 0;
            for(int j = 0; j<jn;j++){
                sum=sum+accounts[i][j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}