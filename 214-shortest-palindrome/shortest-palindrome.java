class Solution {
    public String shortestPalindrome(String s) {
        
        // int n=s.length();
        String rev = new StringBuilder(s).reverse().toString();
        int i=1;
        int len =0;
        String d= s + "#" + rev;
        int n=d.length();
        int [] lps = new int [d.length()];
        while (i<d.length()){
            if(d.charAt(i)==d.charAt(len)){
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
        // String a= s.substring(lps[n-1]);
        // // a =a.reverse +s;
        // return a;

        int palinLen = lps[d.length() - 1];
        String suffixToReverse = s.substring(palinLen);
        return new StringBuilder(suffixToReverse).reverse().toString() + s;
    }
}