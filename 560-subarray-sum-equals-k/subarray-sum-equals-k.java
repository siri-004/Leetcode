class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixsum=0;
        map.put(0,1);
        int answer=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            if(map.containsKey(prefixsum-k)){
                answer+=map.get(prefixsum-k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return answer;
    }
}