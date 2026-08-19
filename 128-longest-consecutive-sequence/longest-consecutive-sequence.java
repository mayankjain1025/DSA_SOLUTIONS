class Solution {
    public int longestConsecutive(int[] nums) {
        // int count=0;
        int maxcount =0;
        HashSet <Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        } 
        for (int num : set) {
            
            if(!set.contains(num-1)){
                int count=1;
                int j=num;
                while(set.contains(j+1)){
                    count++;
                    j++;
                }
                maxcount=Math.max(count,maxcount);
            }
        }
        return maxcount;
    }
}