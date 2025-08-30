class Solution {
    public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid;
        int ans=n;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}