class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        HashMap<Character,String>map=new HashMap<>();
        if(pattern.length()!=str.length){
            return false;
        }
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(str[i])){
                    return false;   
                }
            }
            else{
                if(set.contains(str[i])){
                    return false;
                }
                map.put(ch,str[i]);
                set.add(str[i]);
            }
        }
        return true;

    }
}