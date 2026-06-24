class Solution {
   
  public int fun(int []nums,int goal)
  {
     int n=nums.length;
     int left=0,right=0;
     int count=0;
     HashMap<Integer,Integer>res=new HashMap<>();
     if(goal<0)
     {
        return 0;
     }

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




    public int subarraysWithKDistinct(int[] nums, int goal) {
       return  fun(nums,goal)-fun(nums,goal-1);
    }
}