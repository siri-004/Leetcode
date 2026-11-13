class Solution {
    public String tictactoe(int[][] moves) {
        int rows[]=new int[3];
        int cols[]=new int[3];
        int diagonal=0;
        int antidiagonal=0;
        for(int i=0;i<moves.length;i++){
            int row=moves[i][0];
            int col=moves[i][1];
            int player=(i%2==0)?+1:-1;
            rows[row]+=player;
            cols[col]+=player;
            if(row==col){
                diagonal+=player;
            }
            if(row+col==2){
                antidiagonal+=player;
            }
            if(Math.abs(rows[row])==3||Math.abs(cols[col])==3||
            Math.abs(diagonal)==3||Math.abs(antidiagonal)==3){
                return player==1?"A":"B";
            }
        }
        return moves.length==9?"Draw":"Pending";
    }
}