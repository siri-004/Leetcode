class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        while(right<s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                ans=Math.max(ans,right-left+1);
                right++;
            }

        }
        return ans;
    }
}