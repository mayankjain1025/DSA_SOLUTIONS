class Solution {
    public int numberOfBeams(String[] bank) {
       int r= bank.length;
        int c=bank[0].length();
        int sum=0;
        int prev=0;
        int [] count= new int[r];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(bank[i].charAt(j)=='1'){
                    count[i]=count[i]+1;
                }
            }
        }
        for(int i=0; i<r;i++){
            if(count[i]==0){
                continue;
            }
            else{
                sum=(count[i]*prev)+sum;
                prev= count[i];
            }
        }
        return sum;}
}