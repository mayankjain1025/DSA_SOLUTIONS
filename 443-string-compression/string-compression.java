class Solution {
    public int compress(char[] chars) {
        int r=0; 
        int w=0;
        int n=chars.length;
        while(r<n){
            int groupend= r;
            char curent =chars[r];
            while(groupend <n && chars[groupend]==curent){
                groupend++;
            }
            int count= groupend-r;
            chars[w++]=curent;
            if(count >1){
                for(char digit : Integer.toString(count).toCharArray()){
                    chars[w++]= digit;
                }
            }
            r = groupend;
        }
        return w;
    }
}