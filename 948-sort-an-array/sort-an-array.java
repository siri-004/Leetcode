class Solution {
    private void mergeSort(int[] nums,int[] ans,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(nums,ans,low,mid);
            mergeSort(nums,ans,mid+1,high);
            merge(nums,ans,low,mid,high);
        }
    }
    private void merge(int[] nums,int[] ans,int low,int mid,int high){
        int i=low,j=mid+1,k=low;
        while(i<=mid&&j<=high){
            if(nums[i]<=nums[j]){
            ans[k]=nums[i];
            i++;
            }
            else{
                ans[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            ans[k]=nums[i];
            i++;
            k++;
        }
        while(j<=high){
            ans[k]=nums[j];
            j++;
            k++;
        }
        for(int x=low;x<=high;x++){
            nums[x]=ans[x];
        }
    }
    public int[] sortArray(int[] nums) {
        int[] ans=new int[nums.length];
        mergeSort(nums,ans,0,nums.length-1);
        return ans;
    }
}