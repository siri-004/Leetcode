class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int start=left;start<=right;start++){
            boolean found=false;
            for(int j=0;j<ranges.length;j++){
                if(start>=ranges[j][0]&&start<=ranges[j][1]){
                    found=true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}