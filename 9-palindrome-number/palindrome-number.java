class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int y;
        y=x;
        if (x < 0 ){
            return false;
        }
        while(x!=0){
            int last = x%10;
            x=x/10;
            rev=(rev*10)+last;
        }
        if (rev == y){
            return true;
        }
        else{return false;}
    }
}