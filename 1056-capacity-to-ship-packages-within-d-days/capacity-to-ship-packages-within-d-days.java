class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int n=arr.length;
        int low=findmax(arr,n);
        int high=findsum(arr,n);
        while(low<=high)
        {
            int mid=(low+high)/2;
             int total=findship(arr,mid,days,n);
             if(total<=days)
             {
                high=mid-1;
             }
             else{
                low=mid+1;
             }

        }
        return low;
        
    }
    private int findmax(int arr[],int n)
    {  int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
              max=arr[i];
            }
        }
        
        return max;

    }
    private int findsum(int arr[],int n)
    {  int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.print("this is sum:"+sum+"\n");
        return sum;

    }
    private int findship(int arr[],int mid,int days,int n)
    {
    
      int day=1,load=0;
       for(int i=0;i<n;i++)
       {
        
         if(arr[i]+load>mid)
         {
            day+=1;
            load=arr[i];

         }
         else{
            load+=arr[i];
         }
          
       }
       return day;

    }
}