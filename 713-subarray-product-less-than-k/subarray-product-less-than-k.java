class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
   
        int n=arr.length;
        int left=0;
        int right=0;
        long product=1;
        int count=0;
        if(k<=1)
        {
            return 0;
        }

        while(right<n)
        {
            product*=arr[right];
            while(product>=k)
            {
                product=product/arr[left];
                left++;
            }
            count+=(right-left+1);
          right++;
        }
        return count;
    }
}