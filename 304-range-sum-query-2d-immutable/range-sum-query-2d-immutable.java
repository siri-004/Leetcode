class NumMatrix {
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        prefix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0){
                    prefix[i][j]=matrix[i][j];
                }
                else if(i==0){
                    prefix[i][j]=prefix[i][j-1]+matrix[i][j];
                }
                else if(j==0){
                    prefix[i][j]=prefix[i-1][j]+matrix[i][j];
                }
                else{
                    prefix[i][j]=prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1]+matrix[i][j];
                }
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        if(row1==0&&col1==0){
            sum+=prefix[row2][col2];
        }
        else if(row1==0){
            sum+=prefix[row2][col2]-prefix[row2][col1-1];
        }
        else if(col1==0){
            sum+=prefix[row2][col2]-prefix[row1-1][col2];
        }
        else{
            sum+=prefix[row2][col2]-prefix[row1-1][col2]-prefix[row2][col1-1]+prefix[row1-1][col1-1];
        }
        return sum;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */