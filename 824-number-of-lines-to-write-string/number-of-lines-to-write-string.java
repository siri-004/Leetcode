class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] result= new int[2];
        int lines=1;
        int sum=0;
        for(int i=0;i<s.length();i++){
            int charwidth=widths[s.charAt(i)-'a'];
            if(sum+charwidth>100){
                lines++;
                sum=charwidth;
            }
            else{
                sum=sum+charwidth;
            }
        }
        result[0]=lines;
        result[1]=sum;
        return result;
    }
}