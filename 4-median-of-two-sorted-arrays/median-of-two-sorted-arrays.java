class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {   
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int n1 =nums1.length;
        int n2 = nums2.length;
        // int min=Math.min(n,m);
        int l=0; int r=n1;
        int left= (n1+n2+1)/2;
        while(l<=r){
            int mid1=l+(r-l)/2;
            int mid2=left -mid1;
            // int l1=Intiger.Minvalue; int l2=Intiger.Minvalue;
            // int r1=Intiger.Maxvalue; int r2=Intiger.Maxvalue;
            // if(mid1<n1) r1=nums1[mid1];
            // if(mid2<n2) r2=nums2[mid2];
            int r1 = (mid1 < n1) ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? nums2[mid2] : Integer.MAX_VALUE;
            int l1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            // if(mid1-1>=0) l1=a[mid1-1];
            // if(mid2-1>=0) l2=b[mid2-1];
            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==1) return Math.max(l1,l2);
                // return Math.max(l1, l2);
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            }

            else if(l1>r2) r = mid1-1;
            else l = mid1 +1;
        }
        return 0.0;
    }
}