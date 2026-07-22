class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int minkadane=Integer.MAX_VALUE;
        int maxkadane=Integer.MIN_VALUE;
        int minsum=0,maxsum=0;
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        for(int i=0;i<n;i++){
            minsum+=nums[i];
            maxsum+=nums[i];
            minkadane=Math.min(minkadane,minsum);
            maxkadane=Math.max(maxkadane,maxsum);
            if(minsum>0){
                minsum=0;
            }
            if(maxsum<0){
                maxsum=0;
            }
        }
        if(maxkadane<0)
            return maxkadane;

        return Math.max(maxkadane,total-minkadane);
    }
}