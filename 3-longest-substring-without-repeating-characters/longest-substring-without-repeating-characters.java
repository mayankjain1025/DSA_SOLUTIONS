class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int maxlen=0;
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int r=0;r<n;r++){
            freq.put(s.charAt(r),freq.getOrDefault(s.charAt(r),0)+1);
            while(freq.get(s.charAt(r))>1){
                freq.put(s.charAt(l),freq.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}