class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int  low=0;
        int high=n-1;
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target)
            {
              low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}