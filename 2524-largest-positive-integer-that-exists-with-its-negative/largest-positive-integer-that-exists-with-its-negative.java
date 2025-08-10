class Solution {
    public int findMaxK(int[] arr) {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if(arr[left]>0)
            {
                return -1;
            }

    
          if(Math.abs(arr[left])==arr[right])
          {
            int k=arr[right];
            return k;
        
          }

          else if(Math.abs(arr[left])<arr[right])
          {
            right--;
          }

          else if(Math.abs(arr[left])>arr[right])
          {
            left++;
          }
        
        }
       return -1;
    
        
    }
}