class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        for(int i=1;i<=columnTitle.length();i++){
            char ch=columnTitle.charAt(i-1);
            ans=ans*26+(ch-'A'+1);
        }
        return ans;
    }
}