class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int [] string = new int [26];
        for(int i=0; i<s.length(); i++){
            string[s.charAt(i)-'a']++;
        }
        for(int j=0; j<t.length(); j++){
            if(string[t.charAt(j)-'a']==0){
                return false;
            }
            string[t.charAt(j)-'a']--;
        }
        return true;
        // HashMap<Character,Integer> map = new HashMap<>();
        // for (int i= 0; i<s.length();i++)  {
        //     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        //     }

        // for( int i= 0; i<t.length();i++){
        //     if(!map.containsKey(t.charAt(i))||map.get(t.charAt(i))==0){
        //         return false;
        //     }
        //     map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        // }
        // return true;}
    }
}
