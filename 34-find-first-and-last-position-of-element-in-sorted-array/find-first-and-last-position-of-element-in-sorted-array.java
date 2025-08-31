class Solution {

    public static int lower(int arr[],int target,int n)
    {  
         int low=0;
        int high=n-1;
        int ans=n;
         int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
     public static int Upper(int arr[],int target,int n)
    {
        
        int low1=0;
        int high1=n-1;
          int mid1;
        int ans1=n;
        while(low1<=high1)
        {
            mid1=low1+(high1-low1)/2;
            if(arr[mid1]>target)
            {
                ans1=mid1;
                high1=mid1-1;
            }
            else
            {
                low1=mid1+1;
            }
        }
        return ans1;
    }

    public int[] searchRange(int[] arr, int target) {
        int n=arr.length;
        int lb=lower(arr,target,n);
        int up= Upper(arr,target,n);
        if(lb==n || arr[lb]!=target) return new int[]{-1,-1};
        return new int[]{lb,up-1};
        
        
    }
}