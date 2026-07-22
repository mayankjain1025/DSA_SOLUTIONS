class Solution {
    public int findMaxLength(int[] nums) {
        HashMap <Integer,Integer>map=new HashMap<>();
        int cps=0;
        int maxlen=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            cps+=(nums[i]==1)? 1:-1;
            if(map.containsKey(cps)){
                int l=map.get(cps);
                maxlen=Math.max(maxlen , i-l);
            }

            else{
                map.put(cps,i);
            }
            

        }
        return maxlen;
    }
}