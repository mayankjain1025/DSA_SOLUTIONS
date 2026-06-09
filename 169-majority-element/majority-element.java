class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        // int [] arr = new int[100];
        HashMap <Integer,Integer> counts = new HashMap<>();
        for(int i=0; i<n;i++){
            int num = nums[i];
            counts.put(num, counts.getOrDefault(num ,0)+1);
            // arr[nums[i]] =(arr[nums[i]])+1;
            if(counts.get(num)>n/2){
                // nums[i];
                return num;
            }
        }
        return -1;
        // for((int j=0;j))
    }
}