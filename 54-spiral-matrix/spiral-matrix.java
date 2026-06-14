class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int c=matrix[0].length;
        int r=matrix.length;
        List<Integer> arr= new ArrayList<>();
        if (matrix == null || matrix.length == 0) return arr;
        int top=0;
        int left=0;
        int right=c-1;
        int bot=r-1;
        
        while(top<=bot && left<=right){
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top<=bot){
                for(int i=right;i>=left;i--){
                    arr.add(matrix[bot][i]);
                }
                bot--;
            }
            if(left<=right){
                for(int i=bot;i>=top;i--){
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}