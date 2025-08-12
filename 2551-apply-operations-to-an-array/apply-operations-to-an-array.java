class Solution {
    public int[] applyOperations(int[] arr) {
        int left=0;
        int right=1;
        while(right<arr.length)
        {
          if(arr[left]!=arr[right])
          {
            left++;
            right++;
          }
          else if(arr[left]==arr[right])
          {
            arr[left]=arr[left]*2;
            arr[right]=0;
            left++;
            right++;
          }
        }
        int l=0;
        int r=0;
        while(r<arr.length)
        {
            if(arr[r]!=0)
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
            }
            r++;
        }

        return arr;
    }
}