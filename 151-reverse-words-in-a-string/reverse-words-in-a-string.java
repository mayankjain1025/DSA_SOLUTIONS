class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && a[j] == ' ') j++;
            while (j < n && a[j] != ' ') a[i++] = a[j++];
            while (j < n && a[j] == ' ') j++; 
            if (j < n) a[i++] = ' '; 
        }
        reverse(a, 0, i - 1);

        int start = 0;
        for (int end = 0; end <= i; end++) {
            if (end == i || a[end] == ' ') {
                reverse(a, start, end - 1);
                start = end + 1;
            }
        }

        return new String(a, 0, i);
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
    //     char[] arr=s.toCharArray();
    //     int r=0;
    //     int w=0;
    //     int n= s.length();
    //     while(r<n){
    //         while(r<n && arr[r]==' '){
    //             r++;
    //         }
    //         while(r<n && arr[r]!=' '){
    //             arr[w]=arr[r];
    //             r++; w++;
    //         }
    //         if(r<n){
    //             arr[w++]=' ';
    //         }
    //     }
    //     reverse(arr, 0, w-1);
    //     int start=0;
    //     for(int i=0;i<=w;i++){
    //         if(i==w ||arr[i]== ' '){
    //             reverse(arr,start,i-1);
    //             start = i + 1;
    //         }
            
    //     }
    //     return new String(arr, 0, w);

    //     // int n= s.length();
    //     // char [] ans =new char[n];
    //     // int w=n-1;
    //     // for(int i=0; i<n; i++){
            
    //     //     int space =0;
    //     //     if(s.charAt(i)==' '){
    //     //         int j=i-1;
    //     //         while(j>=0 && s.charAt(j)!=' '){
    //     //             ans[w--]=s.charAt(j--);                
    //     //         } 
    //     //         if(space<1){
    //     //             w++;
    //     //             space++;
    //     //         }
    //     //         space =0;
    //     //     }
    //     // }
    //     // return ans.toString();
    // }
    // private void reverse(char[] arr, int l,int r ){
    //     while (l < r) {
    //         char temp = arr[l];
    //         arr[l] = arr[r];
    //         arr[r] = temp;

    //         l++;
    //         r--;
        }
    }
}