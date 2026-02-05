class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    private int atmost(int nums[],int goal)
    {
        int left=0,right=0,count=0;
        int n=nums.length;
        HashMap<Integer,Integer>res=new HashMap<>();
        while(right<n)
        {
            res.put(nums[right],res.getOrDefault(nums[right],0)+1);
            while(res.size()>goal)
            {
               res.put(nums[left],res.get(nums[left])-1);
               if(res.get(nums[left])==0)
               {
                 res.remove(nums[left]);
               }
               left++;
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }
}