class Solution {
    public int compress(char[] chars) {
        int r=0; 
        int w=0;
        int n=chars.length;
        while(r<n){
            int count =1;
            char current=chars[r];
            while(r+1<n &&current==chars[r+1]){
                count++;
                r++;
            }
            chars[w++] = current;
            r++;
            if(count>1){
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[w++] = digit;
                }
            }
            // else{
            //     w+=2;
            // }

        }
    return w;

        // while(r<n){
        //     int groupend= r;
        //     char curent =chars[r];
        //     while(groupend <n && chars[groupend]==curent){
        //         groupend++;
        //     }
        //     int count= groupend-r;
        //     chars[w++]=curent;
        //     if(count >1){
        //         for(char digit : Integer.toString(count).toCharArray()){
        //             chars[w++]= digit;
        //         }
        //     }
        //     r = groupend;
        // }
        // return w;
    }
}