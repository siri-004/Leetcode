class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp=i;
            boolean Sel=true;
            while(temp>0){
                int digit=temp%10;
                if(digit==0||i%digit!=0){
                    Sel=false;
                    break;
                }
                temp=temp/10;
            }
            if(Sel){
                ans.add(i);
            }
        }
        return ans;
    }
}