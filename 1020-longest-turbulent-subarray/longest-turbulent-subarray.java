class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int ans=1;
        char curr=' ';
        char prev=' ';
        int lencurr=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                curr='>';
            }
            else if(arr[i]<arr[i+1]){
                curr='<';
            }
            else{
                lencurr=1;
                prev=' ';
                continue;
            }
            if(prev==' '){
                lencurr=2;
            }
            else if(prev!=curr){
                lencurr++;
            }
            else{
                lencurr=2;
            }
            prev=curr;
            ans=Math.max(ans,lencurr);
        }
        return ans;
    }
}