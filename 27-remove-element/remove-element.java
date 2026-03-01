class Solution {
    public int removeElement(int[] arr, int val) {
        int n=arr.length;
        int left=0;
        int right=0;
        int count=0;
        int k=0;
        while(right<n)
       {
          if(arr[right]==val)
          {
            count++;
          }
          else{
            arr[k++]=arr[right];
          }
         right++;
       }
       return n-count;
    }
}