class Solution {
    static int count=0;
    public int reversePairs(int[] nums) {
        count=0;
        mergeSort(nums,0,nums.length-1);
        return count;
    }
    static void mergeSort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    static void merge(int[] nums,int low,int mid,int high){
        int left=low,right=mid+1;
        int k=0;
        int[] temp=new int[high-low+1];
        for(int i=low;i<=mid;i++){
            while(right<=high&&(long)nums[i]>2L*nums[right]) {
            right++;
            }
        count+=right-(mid+1);
        }
        left=low;
        right=mid+1;
        while(left<=mid&&right<=high){
            if(nums[left]<=nums[right]){
                temp[k++]=nums[left++];
            }
            else{
                temp[k++]=nums[right++];
            }
        }
        while(left<=mid){
            temp[k++]=nums[left++];
        }
        while(right<=high){
            temp[k++]=nums[right++];
        }
        for(int i=low;i<=high;i++){
            nums[i]=temp[i-low];
        }
    }
}