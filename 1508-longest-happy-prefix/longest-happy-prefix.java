class Solution {
    public String longestPrefix(String s) {
        int [] lps = new int [s.length()];
        int n=s.length();
        int i=1;
        int len =0;
        while (i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        int max=0;
        // for(int i=0;i<n;i++){
        //     max=Math.max(max,lps[i]);
        // }
        return s.substring(0,lps[n-1] ); 
    }
}