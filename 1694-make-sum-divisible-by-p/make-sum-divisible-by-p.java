class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        int target = (int) (totalsum % p);
        if (target == 0) {
            return 0; 
        }
        long cps=0;
        int minLength = nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            cps+=nums[i];
            int currentrem=(int)(cps%p);
            int needrem=(currentrem-target+p)%p;
            if (map.containsKey(needrem)) {
                int leftIndex = map.get(needrem);
                minLength = Math.min(minLength, i - leftIndex);
            }
            map.put(currentrem,i);
        }
        return minLength == nums.length ? -1 : minLength;
    }
}