class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        // if(n==1){
        //     if(nums[0]==k){
        //         return 1;
        //     }
        //     else{
        //         return 0;
        //     }
        // }
        // int l=0;
        // int count=0;
        // for(int r=0;r<n;r++){
        //     sum+=nums[r];
        //     if (sum==k){
        //         count++;
        //     }
        //     while(sum>k){
        //         sum-=nums[l];
        //         l++;
        //         if (sum==k){
        //             count++;
        //         }
        //     }

        // }
        return count;
    }
}