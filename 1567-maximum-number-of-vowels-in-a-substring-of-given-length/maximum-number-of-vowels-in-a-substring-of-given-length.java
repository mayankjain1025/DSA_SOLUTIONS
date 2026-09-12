class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int count =0;
        int maxcount=0;
        for (int i=0;i<k;i++){
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        maxcount = count;

        for(int i=k;i<n;i++){
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
            if (vowels.contains(s.charAt(i - k))) {
                count--;
            }
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }
}