class Solution {
  public int fun(int []nums,int goal)
  {
      int n=nums.length;
      int sum=0;
      int left=0;
      int right=0;
       if(goal<0)
        {
            return 0;
        }
      int count=0;
      while(right<n)
      {
       
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


    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return fun(nums,goal)-fun(nums,goal-1);
        
    }
}