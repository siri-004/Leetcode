class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        int left=high;
        int right=low;
        List<Integer> ans= new ArrayList<>();
        while(k>0){
            if(left<0){
                ans.add(arr[right]);
                right++;
            }
            else if(right>=n){
                ans.add(arr[left]);
                left--;
            }
            else{
                int leftdist=Math.abs(arr[left]-x);
                int rightdist=Math.abs(arr[right]-x);
                if(leftdist<=rightdist){
                    ans.add(arr[left]);
                    left--;
                }
                else{
                    ans.add(arr[right]);
                    right++;
                }
            }
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}