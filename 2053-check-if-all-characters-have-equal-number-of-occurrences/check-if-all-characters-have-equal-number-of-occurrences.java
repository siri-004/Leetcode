class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int freq=map.values().iterator().next();
        for(int count:map.values()){
            if(count!=freq){
                return false;
            }
        }
        return true;
    }
}