class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> uniq=new HashSet<>();
        for(int num:nums){
            uniq.add(num);
        }
        List<Integer> uniqlist=new ArrayList<>(uniq);
        Collections.sort(uniqlist,Collections.reverseOrder());
        if(uniqlist.size()<3){
            return uniqlist.get(0);
        }
        return uniqlist.get(2);
    }
}