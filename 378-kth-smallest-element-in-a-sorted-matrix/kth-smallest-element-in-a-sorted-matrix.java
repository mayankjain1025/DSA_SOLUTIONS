class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n= matrix.length;
        int l= matrix[0][0];
        int r= matrix[n-1][n-1];// last element
        while(l<r){
            int mid = l+(r-l)/2;
            if(countlessOrEqual(matrix , mid ,n)>=k){
                r= mid ;
            }
            else{
                l=mid +1;
            }
        }
        return l ;
        
    }
    private int countlessOrEqual(int[][] matrix , int mid , int n){
        int count=0;
        int row =n-1;
        int col=0;
        while(row>=0 && col<n){
            if(matrix[row][col]<=mid){
                count+=(row +1);
                col++;
            }
            else{
                row--;
            }
        }
        return count;
    }

}