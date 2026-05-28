class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int mini=nums[0],maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi){
                maxi=nums[i];
            }
            if(nums[i]<mini){
                mini=nums[i];
            }
        }
        int hashi[]=new int [maxi+1];
        for(int i=0;i<nums.length;i++){
            hashi[nums[i]]++;
        }
        for(int i=mini;i<=maxi;i++){
            if(hashi[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}