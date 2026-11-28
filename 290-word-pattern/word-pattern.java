class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character ,String> map= new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            String word = words[i];
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }
            else{
                if (map.containsValue(word)) {
                    return false;
                }
            }
            map.put(pattern.charAt(i) ,words[i]);
        }
        return true;
    }
}