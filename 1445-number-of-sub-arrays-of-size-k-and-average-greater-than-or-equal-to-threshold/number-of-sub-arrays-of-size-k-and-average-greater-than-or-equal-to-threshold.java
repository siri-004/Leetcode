class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int s;
        int count=0;
        for(int i=0;i<=arr.length-k;i++){
            s=0;
            for(int j=i;j<i+k;j++){
                s+=arr[j];
            }
                if(s/k>=threshold){
                    count++;
                }
        }
        return count;
    }
}