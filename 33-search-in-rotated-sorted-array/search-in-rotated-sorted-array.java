class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            if(arr[low]<=arr[mid])
            {
                if(arr[low]<=target && target<=arr[mid])
                {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }

            }
           
            else{
                if(arr[mid]<=target && target<=arr[high])
                {
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}