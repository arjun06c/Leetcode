class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;
        int left=0;
        int right=0;
        int min=Integer.MAX_VALUE;
        int length=0;
        int sum=0;
        while(right<n)
        {
            sum+=arr[right];
            while(target<=sum)
            {   length=(right-left+1);
                min=Math.min(min,length);
                sum=sum-arr[left];
                left++;
              
            }
            right++;

        }
        if(min==Integer.MAX_VALUE)
        {

         return 0;   
        }
        return min;
    }
}