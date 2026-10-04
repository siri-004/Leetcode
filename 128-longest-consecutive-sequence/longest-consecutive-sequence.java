class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hash=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        int maxilength=0;
        for(int num:hash){
            if(!hash.contains(num-1)){
                int curr=num;
                int count=0;
                while(hash.contains(curr)){
                    count++;
                    curr++;
                }
                maxilength=Math.max(count,maxilength);
            }
        }
        return maxilength;
    }
}