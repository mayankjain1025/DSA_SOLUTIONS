// class Solution {
//     public int strStr(String haystack, String needle) {
//         int n=haystack.length();
//         int m= needle.length();
//         if(m==0)return 0;
//         if(m>n)return -1;
//         int b=31;
//         long p=1_000_000_007L;
//         long h=1;
//         for(int i=0;i<m-1;i++){
//             h=(h*b)%p;
//         }
//         long needleh =0;
//         long windowtack=0;
//         for(int j=0;j<m;j++){
//             needleh=(needleh*b+(needle.charAt(j) - 'a' + 1)) %p;
//             windowtack=(windowtack*b+(haystack.charAt(j) - 'a' + 1)) %p;
//         }
//         for (int i =0; i <= n-m; i++) {
//             if(needleh==windowtack){
//                 if (haystack.regionMatches(i, needle, 0, m)) {
//                     return i;
//                 }
//             }
//             if (i < n - m) {
//                 long leadingVal = (haystack.charAt(i) - 'a' + 1) * h % p;
//                 windowtack = (windowtack - leadingVal + p) % p;
//                 windowtack = (windowtack * b + (haystack.charAt(i + m) - 'a' + 1)) % p;
//             }
//         }

//         return -1;

//     }
// }


// class Solution {
//     public int strStr(String haystack, String needle) {
//         int n = haystack.length();
//         int m = needle.length();
//         if (m == 0) return 0;
//         if (m > n) return -1;

//         int[] lps = buildLPS(needle);
//         int i = 0; // index for haystack
//         int j = 0; // index for needle

//         while (i < n) {
//             if (haystack.charAt(i) == needle.charAt(j)) {
//                 i++;
//                 j++;
//                 if (j == m) {
//                     return i - j;
//                 }
//             } else {
//                 if (j != 0) {
//                     j = lps[j - 1];
//                 } else {
//                     i++;
//                 }
//             }
//         }

//         return -1;
//     }

//     private int[] buildLPS(String pattern) {
//         int m = pattern.length();
//         int[] lps = new int[m];
//         int len = 0;
//         int i = 1;

//         while (i < m) {
//             if (pattern.charAt(i) == pattern.charAt(len)) {
//                 len++;
//                 lps[i] = len;
//                 i++;
//             } else {
//                 if (len != 0) {
//                     len = lps[len - 1];
//                 } else {
//                     lps[i] = 0;
//                     i++;
//                 }
//             }
//         }

//         return lps;
//     }
// }

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m == 0) return 0;
        if (m > n) return -1;
        String combine= needle +"$"+haystack;
        int [] z=zcreate(combine);
        for (int i = m + 1; i < combine.length(); i++) {
            if (z[i] == m) {
                return i - m - 1;
            }
        }
        return -1;
    }
    private int[] zcreate(String s){
        int n= s.length();
        int [] z= new int [n];
        int l=0;int r=0;
        for(int i=1; i<n ;i++){
            if (i <= r) {
                z[i] = Math.min(r - i + 1, z[i - l]);
            }
            while(i+z[i]<n && s.charAt(z[i]) == s.charAt(i + z[i])){
                z[i]++;
            }
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
            
        }
        return z;
    }
}    