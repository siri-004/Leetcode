class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean[] used=new boolean[magazine.length()];
        for(int i=0;i<ransomNote.length();i++){
            boolean found=false;
            char ch=ransomNote.charAt(i);
            for(int j=0;j<magazine.length();j++){
                if(ch==magazine.charAt(j)&&(!used[j])){
                    found=true;
                    used[j]=true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}