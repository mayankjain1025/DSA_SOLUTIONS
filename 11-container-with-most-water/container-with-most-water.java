class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        if(n==2){
            int min=0;
            if(height[0]>height[1]){
                return height[1];
            }
            else{
                return height[0];
            }
           
        }
        int max=0;
        int l=0;
        int r=n-1;
        while(l<r){
            int min=0;
            int area=0;
            if (height[l]<height[r]){
                min=height[l];
            
            }else{
                min=height[r];
            
            }
            area=min*(r-l);
            if(area>max){
                max=area;
            }
            if (height[l]<height[r]){
                l++;
            
            }else{
                r--;
            }
        }
    
        return max;
    }
}