import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        // Step 1: Sort the candies in ascending order
        Arrays.sort(cost);
        
        int totalCost = 0;
        int n = cost.length;
        
        // Step 2: Iterate from the most expensive to the cheapest
        // We buy cost[i] and cost[i-1], and skip cost[i-2] (it's free!)
        for (int i = n - 1; i >= 0; i--) {
            // Add the first candy of the pair
            totalCost += cost[i]; 
            
            // Check if there's a second candy to buy in this group
            if (i - 1 >= 0) {
                totalCost += cost[i - 1];
            }
            
            // Skip the 3rd candy (i - 2) because it's free
            i -= 2; 
        }
        
        return totalCost;
    }
}