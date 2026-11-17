class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m= needle.length();
        if(m==0)return 0;
        if(m>n)return -1;
        int b=31;
        long p=1_000_000_007L;
        long h=1;
        for(int i=0;i<m-1;i++){
            h=(h*b)%p;
        }
        long needleh =0;
        long windowtack=0;
        for(int j=0;j<m;j++){
            needleh=(needleh*b+(needle.charAt(j) - 'a' + 1)) %p;
            windowtack=(windowtack*b+(haystack.charAt(j) - 'a' + 1)) %p;
        }
        for (int i =0; i <= n-m; i++) {
            if(needleh==windowtack){
                if (haystack.regionMatches(i, needle, 0, m)) {
                    return i;
                }
            }
            if (i < n - m) {
                long leadingVal = (haystack.charAt(i) - 'a' + 1) * h % p;
                windowtack = (windowtack - leadingVal + p) % p;
                windowtack = (windowtack * b + (haystack.charAt(i + m) - 'a' + 1)) % p;
            }
        }

        return -1;

    }
}