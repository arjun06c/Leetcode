class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int n=arr.length;
        int low=1;
        int high=findmax(arr,n);
        int ans=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            int totalhour=findtotal(mid,arr,n);
            if(totalhour<=h)
            {  ans=mid;
               high=mid-1;
            }
            else{
                low=mid+1;
            }


        }
        return ans;
    }
    private int findmax(int arr[],int n)
    {
        int max=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    private int findtotal(int mid,int arr[],int n)
    {  int total=0;
        for(int i=0;i<n;i++)
        {
            total+=Math.ceil(arr[i]/(double)(mid));
        }
        return total;
    }
}