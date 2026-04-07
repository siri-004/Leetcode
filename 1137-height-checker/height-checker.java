class Solution {
    public int heightChecker(int[] heights) {
        int[] oldheights=heights.clone();
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=oldheights[i]){
                count++;
            }
        }
        return count;
    }
}