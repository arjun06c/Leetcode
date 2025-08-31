class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid;
        int ans=Integer.MAX_VALUE;
        while(low<=high)
        { 
            mid=low+(high-low)/2;
            if(arr[low]<=arr[mid])
            {
                 if(ans>arr[low])
                 {
                    ans=arr[low];
                    
                 }
                 low=mid+1;
            }
            else{
                high=mid-1;
                if(ans>arr[mid])
                {
                    ans=arr[mid];
                }
            }
        }
    return ans;
        
    }
}