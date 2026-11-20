class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans=new ArrayList<>();
        char col1=s.charAt(0);
        char row1=s.charAt(1);
        char col2=s.charAt(3);
        char row2=s.charAt(4);
        for(char col=col1;col<=col2;col++){
            for(char row=row1;row<=row2;row++){
                ans.add(""+col+row);
            }
        }
        return ans;
    }
}