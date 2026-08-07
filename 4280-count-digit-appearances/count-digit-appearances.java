class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int totalCount = 0;
        for (int num : nums) {
            if (num == 0 && digit == 0) {
                totalCount++;
                continue;
            }
            int temp = num;
            while (temp > 0) {
                int lastDigit = temp % 10;
                
                if (lastDigit == digit) {
                    totalCount++; 
                }
                
                temp = temp / 10;
            }
        } 
        return totalCount;
    }
}