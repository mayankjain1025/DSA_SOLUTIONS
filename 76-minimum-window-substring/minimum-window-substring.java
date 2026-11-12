class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        // int r=0;
        HashMap <Character,Integer> map=new HashMap<>();
        
        // for(int i=0;i<m;i++){
        //     map.put(t(i),+1);
        // }
        // while(r<n){
        //     if(map.get([s(r)])>0)[
        //         map.get([s(r),-1)
        //     ]
        // }

        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        for(int i=0;i<m;i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1);
        }
        int count=m;
        int minLen = Integer.MAX_VALUE;
        int maxlen=0;
        int startIndex=0;
        int l=0;
        for(int r=0;r<n;r++){
            char rightChar = s.charAt(r);
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)-1);
            if(map.get(s.charAt(r))>=0){
                count--;
            }
            while(count==0){
                // Math.min(r-l+1, maxlen);
                // startIndex = l;
                // map.put(s.charAt(l), map.getOrDefault(s.charAt(l),0)+1);
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIndex = l;
                }
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) + 1);
                if(map.get(leftChar)>0){
                    count++;
                }
                l++;
            } 
        }
        // int[] map = new int[128];
        // for (char c : t.toCharArray()) {
        //     map[c]++;
        // }

        // int count = t.length();
        // int left = 0, right = 0;
        // int minLen = Integer.MAX_VALUE;
        // int startIndex = 0;

        // while (right < s.length()) {
        //     char rChar = s.charAt(right);
        //     if (map[rChar] > 0) {
        //         count--;
        //     }
        //     map[rChar]--;
        //     right++;

        //     while (count == 0) {
        //         if (right - left < minLen) {
        //             minLen = right - left;
        //             startIndex = left;
        //         }

        //         char lChar = s.charAt(left);
        //         map[lChar]++;
        //         if (map[lChar] > 0) {
        //             count++;
        //         }
        //         left++;
        //     }
        // }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);

    }
}