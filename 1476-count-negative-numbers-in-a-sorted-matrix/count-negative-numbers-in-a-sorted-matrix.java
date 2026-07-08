class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            int cols=grid[i].length;
            int left=0;
            int right=cols-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(grid[i][mid]<0){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            count+=cols-left;
        }
        return count;
    }
}