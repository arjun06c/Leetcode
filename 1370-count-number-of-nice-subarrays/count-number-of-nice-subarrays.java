class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       return atmost(nums,k)-atmost(nums,k-1);
    }
    private int atmost(int nums[],int goal)
    {
        if(goal<0)
        {
           return 0;
        }
        int left=0,right=0,count=0,sum=0;
        int n=nums.length;
        while(right<n)
        {
            sum+=nums[right]%2;
            while(sum>goal)
            {
            sum-=nums[left]%2;
            left++;
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }
}