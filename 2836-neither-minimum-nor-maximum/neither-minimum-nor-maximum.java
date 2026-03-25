class Solution {
    public int findNonMinOrMax(int[] nums) {
        Set<Integer> uniq=new HashSet<>();
        for(int num: nums){
            uniq.add(num);
        }
        List<Integer> uniqlist=new ArrayList<>(uniq);
        Collections.sort(uniqlist);
        if(uniqlist.size()<3){
            return -1;
        }
        return uniqlist.get(1);
    }
}