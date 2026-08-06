class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        long ts=0;
        long ls=0;
        long rs=0;
        int [] result=new int[n];
        for(int i=0;i<n;i++){
            ts+=nums[i];
        }
        for(int j =0;j<n;j++){
            rs=ts-nums[j]-ls;
            result[j]=(int) Math.abs(ls-rs);
            ls+=nums[j];
        }
        return result;
    }
}