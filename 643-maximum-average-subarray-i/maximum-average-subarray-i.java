class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        Double sum=0.0;
        for(int i=0;i<k;i++)
        {
           sum+=nums[i];
        }
    double ans=0.0;
        double max=sum/k;
        for(int i=k;i<n;i++)
        {
            sum-=nums[i-k];
            sum+=nums[i];
            ans=sum/k;
            max=Math.max(ans,max);
        }
        return max;
    }
}