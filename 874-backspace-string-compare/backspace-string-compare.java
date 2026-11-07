class Solution {
    public boolean backspaceCompare(String s, String t) {
        char [] arr= new char[s.length()];
        char[] tarr = new char[t.length()];
        int sLen = process(s, arr);
        int tLen = process(t, tarr);
        if (sLen != tLen) {
            return false;
        }
        for (int i = 0; i < sLen; i++) {
            if (arr[i] != tarr[i]) {
                return false;
            }
        }
        return true;
    }
    private int process(String str , char [] arr){
        int j=0;
        for(int i=0; i<str.length(); i++){
            // int count=0;
            char ch = str.charAt(i);
            if(ch!='#'){
                arr[j]=ch;
                j++;
            }
            else if(j>0){
                j--;
            }
        }
        return j ;
    }
}