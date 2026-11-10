import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k=p.length(); int n=s.length();
        if (k > n) {
            return new ArrayList<>();
        }

        int[] pcount = new int[26];
        int[] scount = new int[26];

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<k;i++){
            pcount [p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;
        }
        int count=0;
        // int r=k;
        for(int j=0;j<26;j++){
            if(pcount[j]==scount[j]){
                count++;
            }
        }
        if (count==26) {
            result.add(0);
        }
        for(int l=k;l<n;l++){
            
            int inidx = s.charAt(l)-'a';
            int outidx = s.charAt(l-k)-'a';
            scount[inidx]++;
            if(scount[inidx]==pcount[inidx]) count++;
            else if(scount[inidx]==pcount[inidx]+1) count--;

            scount[outidx]--;
            if(scount[outidx]==pcount[outidx]) count++;
            else if(scount[outidx]==pcount[outidx]-1) count--;
            if(count==26){
                result.add(l - k + 1);
            }
        }
        return result;

        // Step 1: Count target frequencies
        // and initialize the first window
        // for (int i = 0; i < p.length(); i++) {

        //     pCount[p.charAt(i) - 'a']++;
        //     windowCount[s.charAt(i) - 'a']++;
        // }

        // // Check if the first window is an anagram
        // if (Arrays.equals(pCount, windowCount)) {
        //     result.add(0);
        // }

        // // Step 2: Slide the window
        // int k = p.length();

        // for (int i = k; i < s.length(); i++) {

        //     // Add incoming character on the right
        //     windowCount[s.charAt(i) - 'a']++;

        //     // Remove outgoing character on the left
        //     windowCount[s.charAt(i - k) - 'a']--;

        //     // Check if frequency arrays match
        //     if (Arrays.equals(pCount, windowCount)) {

        //         // Start index of current window
        //         result.add(i - k + 1);
        //     }
        // }

        // return result;
    }
}