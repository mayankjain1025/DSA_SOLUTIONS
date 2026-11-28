// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }
//         HashMap<integer,integer> map =new HashMap<>();
//         int [] freqs= new int [128];
//         int [] freqt= new int [128];
//         for(int i=0;i<t.lenght();i++){
//             freqt[t.charAt(i)]++;
//             freqs[s.charAt(i)]++;
//         }
//         for(int j=0;j<128; j++ ){
//             map.put(freqs[j],map.getOrDefult++);
//         }
//         for(int j=0;j<128; j++ ){
//             map.put(freqt[j],map.getOrDefult--);
//             if(map.get(freqt[j])==0){
//                 map.remove(freqt[j]);
//             }
//         }
//         if(map.size==0){
//             return true;
//         }
//         else{return false;}
//     }
// }

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[128];
        int[] mapT = new int[128];
        // for(int i=0;i<t.length();i++){
        //     mapT[t.charAt(i)]++;
        //     mapS[s.charAt(i)]++;
        // }
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If their last seen positions don't match, the 1-to-1 mapping is broken
            if (mapS[c1] != mapT[c2]) {
                return false;
            }

            // Store i + 1 so it stays distinct from the default 0 (unvisited)
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }
        return true;
    }
}