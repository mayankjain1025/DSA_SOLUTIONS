class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            
            if (j == 0 || nums[i] != nums[j - 1]) {
                count = 1;          
                nums[j] = nums[i];  
                j++;                
            } 
           
            else if (count < 2) {
                count++;            
                nums[j] = nums[i]; 
                j++;                
            }
        }
        
        return j;
    }
}