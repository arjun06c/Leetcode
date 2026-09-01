class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long prefix=0;
        for(int i=0;i<n;i++)
        {
            prefix+=nums[i];
        }
        long leftsum=0;
        int count=0;
        
        for(int i=0;i<n-1;i++)
        {
            leftsum+=nums[i];
             long sum=prefix-leftsum;
            if(leftsum>=sum)
            {
                count++;
            }
          
        }
        return  count;
    }
}