class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int rightsum=0;
        int total=0;
        for(int i=0;i<n;i++)
        {
          total+=nums[i];
        }
        int answer[]=new int[n];
        int leftsum=0;
        for(int i=0;i<n;i++)
        {
            total-=nums[i];
            rightsum=total;
           answer[i]=Math.abs(rightsum-leftsum);
           leftsum+=nums[i];
        }
        return answer;
    }
}