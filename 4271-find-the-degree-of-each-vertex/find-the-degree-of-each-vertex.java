class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int [] m =new int [n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                m[j]=m[j]+matrix[i][j];
            }
        }
        return m;
    }
}