class Solution {
    public int characterReplacement(String s, int k) {
        int l=0; int maxlen=0;
        char maxfreq=(s.charAt(0));
        int [] freq=new int [26];
        for(int r=0;r<s.length(); r++){
            freq[s.charAt(r)-'A']++;
            if(freq[s.charAt(r)-'A']>freq[maxfreq-'A']){
                maxfreq=s.charAt(r);
            }
            if((r-l+1)-freq[maxfreq-'A']>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }







        // int n=s.length();
        // int [] count =new int [26];
        // int l=0;
        // int maxlen=0;
        // int maxf=0;
        // for(int r=0;r<n;r++){
        //     count[s.charAt(r)-'A']++;
        //     maxf=Math.max(maxf,count[s.charAt(r)-'A']);
            
        //     if((r-l+1)-maxf>k){
        //         count[s.charAt(l)-'A']--;
        //         l++;
        //     }
        //     maxlen=Math.max(maxlen,r-l+1);
        // }
        return maxlen;
    }
}