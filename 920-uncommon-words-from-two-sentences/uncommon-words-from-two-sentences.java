class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> count=new HashMap<>();
        String[] s=(s1+" "+s2).split(" ");
        for(String word:s){
            count.put(word,count.getOrDefault(word,0)+1);
        }
        List<String> result=new ArrayList<>();
        for(String word:s){
            if(count.get(word)==1){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);

    }
}