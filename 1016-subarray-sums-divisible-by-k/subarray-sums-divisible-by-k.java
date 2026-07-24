import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        HashMap <Integer,Integer>map= new HashMap<>();
        int cps=0;
        int count=0;
        map.put(0, 1);
        for(int i=0;i<n;i++){
            cps+=nums[i];
            int reminder=cps%k;
            if(reminder<0){
                reminder+=k;
            }
            if(map.containsKey(reminder)){
                count+=map.get(reminder);
            }
            map.put(reminder,map.getOrDefault(reminder ,0)+1);
        }
        return count;
    }
}