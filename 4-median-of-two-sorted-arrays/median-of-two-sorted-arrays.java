class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mix=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                mix[k]=nums1[i];
                i++;
            }
            else{
                mix[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            mix[k++]=nums1[i++];
        }
        while(j<nums2.length){
            mix[k++]=nums2[j++];
        }
        int idx=(mix.length/2);
        if(mix.length%2==0){
            return (mix[idx-1]+mix[idx])/2.0;
        }
        else{
            return mix[idx];
        }
    }
}