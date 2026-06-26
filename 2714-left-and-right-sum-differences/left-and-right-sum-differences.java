class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int n=nums.length;
        int rightsum=0;
        for(int i=0;i<n;i++)
        {
            rightsum+=nums[i];
        }
        int leftsum=0;
        int diff[]=new int[n];
        for(int i=0;i<n;i++)
        {
            rightsum-=nums[i];
            diff[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        }
        return diff;
    }
}