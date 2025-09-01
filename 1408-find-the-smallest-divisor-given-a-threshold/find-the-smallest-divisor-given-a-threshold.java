class Solution {

   public int fun(int mid,int arr[])
   { int sum=0;
      for(int i=0;i<arr.length;i++)
      {
         sum+=Math.ceil((double)(arr[i])/mid);
      }
      return sum;
   }


    public int smallestDivisor(int[] arr, int threshold) {
        int low=1;
        int high=Arrays.stream(arr).max().getAsInt();
        int ans=-1;
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(fun(mid,arr)<=threshold)
            {  ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}