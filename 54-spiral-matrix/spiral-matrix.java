class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int top=0,bottom=rows-1,left=0,right=cols-1;
        List<Integer> ans=new ArrayList<>();
        while(top<=bottom&&left<=right){
            int i=left;
            while(i<=right){
                ans.add(matrix[top][i]);
                i++;
            }
            top++;
            int j=top;
            while(j<=bottom){
                ans.add(matrix[j][right]);
                j++;
            }
            right--;
            if(top<=bottom){
                i=right;
                while(i>=left){
                    ans.add(matrix[bottom][i]);
                i--;
            }
            bottom--;
            }
            if(left<=right){
                j=bottom;
                while(j>=top){
                    ans.add(matrix[j][left]);
                    j--;
                }
                left++;
            }
        }
        return ans;
        }
    }