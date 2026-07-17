class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            char[] arr=String.valueOf(i).toCharArray();
            boolean Sel=true;
            for(char c:arr){
                int digit=c-'0';
                if(digit==0){
                    Sel=false;
                    break;
                }
                if(i%digit!=0){
                    Sel=false;
                    break;
                }
            }
            if(Sel){
                ans.add(i);
            }
        }
        return ans;
    }
}