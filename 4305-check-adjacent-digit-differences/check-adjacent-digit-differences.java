class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-'0';
        }
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])>2){
                return false;
            }
        }
        return true;
    }
}