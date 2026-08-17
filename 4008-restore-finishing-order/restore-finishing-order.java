class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // Step 1: Store all friends in a HashSet for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < friends.length; i++) {
            set.add(friends[i]);
        }
        
        // Step 2: Prepare the result array and an index tracker
        int[] nums = new int[friends.length];
        int index = 0;
        
        // Step 3: Iterate through the order array
        for (int j = 0; j < order.length; j++) {
            // If the current person is a friend, add them to the result
            if (set.contains(order[j])) {
                nums[index] = order[j];
                index++;
            }
        }
        
        return nums;
    }
}