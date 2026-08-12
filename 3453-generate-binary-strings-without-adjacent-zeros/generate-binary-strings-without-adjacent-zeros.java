import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int n, StringBuilder current, List<String> result) {
       
        if (current.length() == n) {
            result.add(current.toString());
            return;
        }

        // Option 1: Try appending '1' (always allowed)
        current.append('1');
        backtrack(n, current, result);
        current.deleteCharAt(current.length() - 1); // backtrack

        // Option 2: Try appending '0' 
        // Allowed only if string is empty OR the last character is '1'
        if (current.length() == 0 || current.charAt(current.length() - 1) == '1') {
            current.append('0');
            backtrack(n, current, result);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}