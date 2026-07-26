class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int area=0,maxarea=0;
        int left=0,right=n-1;;
        while(left<right){
            area=Math.min(height[left],height[right])*(right-left);
            maxarea=Math.max(area,maxarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}