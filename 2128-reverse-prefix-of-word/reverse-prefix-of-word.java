class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0;
        String r="";
        while(i<word.length()){
            if(word.charAt(i)==ch){
                int t=i;
                String slice=word.substring(0,t+1);
                r=new StringBuilder(slice).reverse().toString();
                return r+word.substring(i+1);
            }
            i++;
        }
        return word;
    }
}