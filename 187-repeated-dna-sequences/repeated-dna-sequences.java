class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n=s.length();
        List<String> result = new ArrayList<>();
        if(n<10){
            return result;
        }
       
        int b=4;
        int p=9;
        int hash=0;
        Set<Integer> seen = new HashSet<>();
        Set<String> added = new HashSet<>();
        for (int i=0; i<10;i++){
            if(s.charAt(i)=='A'){
                hash+=0;
                p--;
            }
            else if(s.charAt(i)=='C') hash+=1*Math.pow(4,p--);
            else if(s.charAt(i)=='G') hash+=2*Math.pow(4,p--);
            else if(s.charAt(i)=='T') hash+=3*Math.pow(4,p--);
        }
        int l=0;
        seen.add(hash);
        for(int r=10;r<n;r++){
            if(s.charAt(l)=='A'){
                hash-=0;
            }
            else if(s.charAt(l)=='C') hash-=1*Math.pow(4,9);
            else if(s.charAt(l)=='G') hash-=2*Math.pow(4,9);
            else if(s.charAt(l)=='T') hash-=3*Math.pow(4,9);
            l++;

            hash *= 4;

            if(s.charAt(r)=='A'){
                hash+=0;
            }
            else if(s.charAt(r)=='C') hash+=1;
            else if(s.charAt(r)=='G') hash+=2;
            else if(s.charAt(r)=='T') hash+=3;
            
            if (seen.contains(hash)) {
                String sub = s.substring(r - 9, r + 1);
                if (added.add(sub)) { // Fix 4: add to result only once
                    result.add(sub);
                }
            }
            seen.add(hash);
        }
        return result;
    }
}