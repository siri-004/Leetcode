class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j&& !isVowel(arr[i])){
                i++;
            }
            while(i<j&& !isVowel(arr[j])){
                j--;
            }
            char t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        return new String(arr);
    }
    public boolean isVowel(char s){
        s=Character.toLowerCase(s);
        return s=='a'||s=='e'||s=='i'||s=='o'||s=='u';
    }
}