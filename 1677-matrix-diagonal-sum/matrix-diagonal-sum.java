class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        if (n==1){
            return mat[0][0];
        }
        int j=n-1;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][j];
            j--;
        }
        if(n%2==0){
                return sum;
        }
        else{return sum-mat[n/2][n/2];}
        // return sum;
    }
}