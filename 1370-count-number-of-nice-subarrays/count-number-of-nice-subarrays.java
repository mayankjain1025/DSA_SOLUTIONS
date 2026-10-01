class Solution {
    private int atMost(int[] nums, int k) {
        int n= nums.length;
        int count=0;
        int odd=0;
        int l=0;
        for (int i=0;i<n;i++){
            if(nums[i]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[l]%2!=0){
                    odd--;
                    
                }
                l++;
            }
            
            // if(odd==k){
            //     count++;
            // }
            count += i - l + 1;
        }
        return count;









        // int n = nums.length;
       
        // int[] counts = new int[n + 1];
        // counts[0] = 1; 
        
        // int ans = 0;
        // int oddCount = 0;
        
        // for (int i = 0; i < n; i++) {
        //     oddCount += nums[i] % 2;
            
        //     // If we have at least k odd numbers, check if we can form a valid subarray
        //     if (oddCount >= k) {
        //         ans += counts[oddCount - k];
        //     }
            
        //     // Record that we've seen this specific oddCount
        //     counts[oddCount]++;
        // }
        
        // return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
}