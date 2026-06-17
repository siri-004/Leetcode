class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int j=0;
            int k=image[i].length-1;
            while(j<=k){
                int temp=image[i][j];
                image[i][j]=1-image[i][k];
                image[i][k]=1-temp;
                j++;
                k--;
            }
        }
        return image;
    }
}