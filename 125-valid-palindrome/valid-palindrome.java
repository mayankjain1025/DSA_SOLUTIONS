class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int n = s.length();
        int l=0;int r=n-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;r--;
        }
        // for(int i = 0; i < n/2; i++){
        //     if(s.charAt(i) != s.charAt(n-1-i)){
        //         return false;
        //     }
        // }
        return true;
    }
}