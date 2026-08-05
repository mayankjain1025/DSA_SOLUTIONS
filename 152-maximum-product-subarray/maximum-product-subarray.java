class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int global_max=nums[0];
        int current_max=nums[0];
        int current_min=nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if(num<0){
                int temp = current_max;
                current_max = current_min;
                current_min = temp;
            }
            current_max = Math.max(num, current_max * num);
            current_min = Math.min(num, current_min * num);

            global_max= Math.max(global_max, current_max);
        }
        return global_max;
            
    }
}