class Solution {
    public int findPairs(int[] nums, int k) {
        int n=nums.length;
        int count=0; 
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i:map.keySet()){
            if(k==0){
                if(map.get(i)>=2){
                    count++;
                }
            }
            else if(map.containsKey(i+k)){
                count++;
            }
        }
        return count;
    }
}