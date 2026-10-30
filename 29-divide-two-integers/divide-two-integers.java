class Solution {
    public int divide(int dividend, int divisor) {
        // int l=0;
        // int r=Math.max(1,dividend);
        // for (int i = 0; i < 80; i++) {
        //     int mid=l+(r-l)/2;
        //     if(mid* divisor<=dividend){
        //         l= mid;
        //     }
        //     else{
        //         r=mid;
        //     }
        // }
        // return l;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int quotient = 0;

        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                quotient += (1 << i);
                a -= (b << i);
            }
        }

        return negative ? -quotient : quotient;
    }
}
