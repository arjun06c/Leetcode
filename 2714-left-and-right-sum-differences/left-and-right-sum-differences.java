class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<n;i++)
        {
            rightsum+=nums[i];
        }
        int diff[]=new int[n];
        for(int i=0;i<n;i++)
        {
            rightsum-=nums[i];
            diff[i]=Math.abs(rightsum-leftsum);
            leftsum+=nums[i];
        }
        return diff;
    }
}