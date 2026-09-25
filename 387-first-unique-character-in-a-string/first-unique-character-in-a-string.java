class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean flag=false;
            for(int j=0;j<s.length();j++){
                if(i!=j&&ch==s.charAt(j)){
                    flag=true;//same character found
                    break;
                }
            }
            if(!flag){
                return i;
            }
        }
        return -1;
    }
}