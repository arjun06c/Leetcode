class Solution {
    public int maxAbsoluteSum(int[] nums) {
         int n=nums.length;
        int currmin=nums[0];
        int minval=nums[0];
        int currmax=nums[0];
        int maxval=nums[0];
        
        for(int i=1;i<n;i++)
        {
                 
                 currmax=Math.max(nums[i],currmax+nums[i]);
                 maxval=Math.max(maxval,currmax);

                currmin=Math.min(nums[i],currmin+nums[i]);
                 minval=Math.min(minval,currmin);

        }
        return Math.max(maxval,Math.abs(minval));
    }
}