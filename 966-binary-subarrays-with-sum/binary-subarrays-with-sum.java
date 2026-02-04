class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       
        return atmost(nums,goal)-atmost(nums,goal-1);
    }
    private int atmost(int nums[],int goal)
    {
      int sum=0;
      int n=nums.length;
      int left=0,right=0;
      int count=0;
      while(right<n)
      {
        if(goal<0)
        {
            return 0;
        }
        sum+=nums[right];
        while(sum>goal)
        {
            sum-=nums[left];
            left++;
        }
        count+=(right-left+1);
        right++;

      }
      return count;


    }
}