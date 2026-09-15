class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans=0;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                ans=ans^nums[i];
            }
            else{
                s.add(nums[i]);
            }
        }
        return ans;
    }
}