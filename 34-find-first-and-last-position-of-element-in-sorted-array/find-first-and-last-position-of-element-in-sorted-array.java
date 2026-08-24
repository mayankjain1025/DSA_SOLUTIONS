class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=lowerbound(nums, target);
        if (f == nums.length || nums[f] != target) {
            return new int[]{-1, -1};
        }
        int s=upperbound(nums,target)-1;
        return new int[]{f, s};
    }
    public int lowerbound(int [] nums,int target){
        int l=0;
        int r=nums.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target)r=mid;
            else{l=mid+1;}
        }
        return l;
    }
    public int upperbound(int [] nums,int target){
        int l=0;
        int r=nums.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target)r=mid;
            else{l=mid+1;}
        }
        return l;
    }

        
}
        // int n=nums.length;
        // if(n==0){
        //     ans[0]=-1;
        //     ans[1]=-1;
        //     return ans;
        // }
        // int l=0;
        // int r=n-1;
        // int [] ans=new int [2];
        // while(l<=r){
        //     int mid=(l+r)/2;
        //     if(nums[mid]==target){
        //         if(nums[mid-1]==target){
        //             ans[0]=mid-1;
        //             ans[1]=mid;
        //             return ans;
        //         }
        //         else{
        //             ans[0]=mid;
        //             ans[1]=mid+1;
        //             return ans;
        //         }
        //     }
        //     else if(target>nums[mid]){
        //         l=mid+1;
        //     }
        //     else{
        //         r=mid-1;
        //     }
        // }
        // ans[0]=-1;
        // ans[1]=-1;
        // return ans;
//     }
// }