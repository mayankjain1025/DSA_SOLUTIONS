class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Loop backwards starting from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If it's not a 9, just add 1 and we are done!
                digits[i]++;
                return digits;
            }
            // If it is a 9, it becomes 0 and we carry the 1 to the next loop iteration
            digits[i] = 0;
        }
        
        // If we exit the loop, it means the number was something like 99, 999, etc.
        // We need a new array with one extra space for the carry.
        int[] result = new int[n + 1];
        result[0] = 1; // The rest of the array is already initialized to 0s by default in Java
        
        return result;
    }
}