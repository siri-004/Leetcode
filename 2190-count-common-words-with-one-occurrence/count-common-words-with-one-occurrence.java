class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> frq1=new HashMap<>();
        Map<String,Integer> frq2=new HashMap<>();
        for(String s:words1){
            frq1.put(s,frq1.getOrDefault(s,0)+1);
        }
        for(String s:words2){
            frq2.put(s,frq2.getOrDefault(s,0)+1);
        }
        int count=0;
        for(String word:frq1.keySet()){
            if(frq1.get(word)==1&&frq2.getOrDefault(word,0)==1){
                count++;
            }
        }
        return count;
    }
}