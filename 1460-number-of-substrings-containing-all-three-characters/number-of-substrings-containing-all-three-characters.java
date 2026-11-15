class Solution {
    public int numberOfSubstrings(String s) {
       int n=s.length();
       int [] lastseen=new int [3];
       int l =0;
       int string=0;
       for(int r=0;r<n;r++){
            lastseen[s.charAt(r)-'a']++;
            while(lastseen[0]>0 && lastseen[1]>0 && lastseen[2]>0){
                string+=(n-r);
                lastseen[s.charAt(l)-'a']--;
                l++;
            }
       }
       return string;
    //    Arrays.fill(lastseen,-1);
    //    for(int i=0;i<n;i++){
    //        lastseen[s.charAt(i)-'a']=i;
    //        if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1){
    //             count=count+(1 + Math.min(lastseen[0],(Math.min(lastseen[1],lastseen[2]))));
    //        } 
    //    } 
    //    return count;
    }
}