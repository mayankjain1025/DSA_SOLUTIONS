class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int cps=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            cps+=nums[i];
            int remainder=cps % k;
            if(map.containsKey(remainder)){
                if(i- map.get(remainder) >= 2){
                    return true;
                }
            }
            else{
                map.put(remainder, i);
            }
        }
        return false;
    }
}