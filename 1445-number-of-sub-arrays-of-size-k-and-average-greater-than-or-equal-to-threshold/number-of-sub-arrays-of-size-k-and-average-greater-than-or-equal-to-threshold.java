class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        int count=0;
        if(s/k>=threshold){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            s-=arr[i-k];
            s+=arr[i];
            if(s/k>=threshold){
                count++;
            }
        }
        return count;
    }
}