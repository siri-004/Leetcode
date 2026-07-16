class Solution {
    public int findGCD(int[] nums) {
        int mini=nums[0],maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<mini){
                mini=nums[i];
            }
            if(nums[i]>maxi){
                maxi=nums[i];
            }
        }
        for(int i=mini;i>=1;i--){
            if(mini%i==0&&maxi%i==0){
                return i;
            }
        }
        return 1;
    }
}