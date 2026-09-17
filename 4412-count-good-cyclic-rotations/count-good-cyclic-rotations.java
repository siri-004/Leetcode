class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int count=0;
        long firstsum=0;
        long secondsum=0;
        for(int j=0;j<n;j++){
            if(j<n/2){
                firstsum+=nums[j];
            }
            else{
                secondsum+=nums[j];
            }
        }
        for(int i=0;i<n;i++){
            if(firstsum>secondsum){
                count++;
            }
            long first=nums[i];
            long middle=nums[(i+n/2)%n];
            firstsum=firstsum-first+middle;
            secondsum=secondsum-middle+first;
        }
        return count;
    }
}