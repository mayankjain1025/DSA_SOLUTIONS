// class Solution {
//     public int longestPalindrome(String s) {
//         int[] freq = new int[26];

//         for (int i = 0; i < s.length(); i++) {
//             freq[s.charAt(i)]++;
//         }
//         int count=0;
//         for(int i = 0; i < freq.length; i++){
//             // if(freq[i]%2==0){
//             //     count+=freq[i];
//             // }
//             count +=(freq[i]/2)*2;
//         }
//         return count < s.length() ? count + 1 : count;
//     }
// }

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // Covers both uppercase and lowercase ASCII letters
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int count = 0;
        for (int f : freq) {
            count += (f / 2) * 2; // Add the largest even number <= f
        }

        // If any character was left over (odd frequency), put 1 in the center
        return count < s.length() ? count + 1 : count;
    }
}