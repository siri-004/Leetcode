class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int[] freq=new int[128];
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }
        int left=0,right=0,formed=0;
        int required=t.length();
        int minlen=Integer.MAX_VALUE;
        int start=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(freq[ch]>0){
                formed++;
            }
            freq[ch]--;
            right++;
            while(formed==required){
                if(right-left<minlen){
                    minlen=right-left;
                    start=left;
                }
                char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0){
                    formed--;
                }
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start,start+minlen);
    }
}