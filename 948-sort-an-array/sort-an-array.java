class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        return mergesort(nums,0,n-1);
    }
    private int[] mergesort(int []arr,int low,int high )
    {
        if(low>=high) return arr;
       int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,high,mid);
        return arr;
    }
    private int[] merge(int[]arr,int low,int high,int mid)
    {
        ArrayList<Integer>res=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                  res.add(arr[left]);
                  left++;
            }
            else{
                res.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            res.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            res.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=res.get(i-low);
        }
        return arr;
    }
}