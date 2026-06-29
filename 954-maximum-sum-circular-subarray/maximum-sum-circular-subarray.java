class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int currmin=nums[0];
        int minval=nums[0];
        int currmax=nums[0];
        int maxval=nums[0];
        int totalsum=nums[0];
        for(int i=1;i<n;i++)
        {
                 totalsum+=nums[i];
                 currmax=Math.max(nums[i],currmax+nums[i]);
                 maxval=Math.max(maxval,currmax);

                currmin=Math.min(nums[i],currmin+nums[i]);
                 minval=Math.min(minval,currmin);

        }
    if(maxval<0)
    {
        return maxval;
    }
    return (Math.max(maxval,totalsum-minval));


    }
}