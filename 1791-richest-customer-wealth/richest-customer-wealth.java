class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int ans=0;
        for(int i=0;i<m;i++){
            int med=0;
            for(int j=0;j<accounts[i].length;j++){
                med+=accounts[i][j];
            }
            ans=Math.max(ans,med);
        }
        return ans;
    }
}