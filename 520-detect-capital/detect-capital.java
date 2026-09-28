class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        char[] arr=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                count++;
            }
        }
        return count==0||count==arr.length||(count==1&&Character.isUpperCase(arr[0]));
    }
}