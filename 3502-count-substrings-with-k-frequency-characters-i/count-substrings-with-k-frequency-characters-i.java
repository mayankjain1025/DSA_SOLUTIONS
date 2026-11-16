class Solution {
    public int numberOfSubstrings(String s, int k) {
        int [] frq = new int[26];
        int count=0;
        int l=0;
        int n=s.length();
        for(int r=0; r<s.length(); r++){
            frq[s.charAt(r)-'a']++;
            while(frq[s.charAt(r)-'a']==k){
                count+=n-r;
                frq[s.charAt(l)-'a']--;
                l++;

            }
        }
        return count ;
    }
}