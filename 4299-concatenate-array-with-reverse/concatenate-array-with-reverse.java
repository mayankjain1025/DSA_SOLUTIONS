class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n= nums.length;
        int [] ans= new int[2*n];
        int j=n-1;
        for(int i=0;i<2*n;i++){
            if(i<=n-1){
                ans[i]=nums[i];
            }
            else{ans[i]=nums[j];
            j--;

            }
        }
        return ans;
    }
}