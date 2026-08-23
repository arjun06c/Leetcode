class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
         HashMap<Integer,Integer>res=new HashMap<>();
        int prefix=0;
        res.put(0,1);
        int count=0;
        for(int i=0;i<n;i++)
        {
            prefix+=nums[i];
            int val=prefix-goal;
            if(res.containsKey(val))
            {
                count+=res.get(val);
            }
            res.put(prefix,res.getOrDefault(prefix,0)+1);
        }
        return count;
        
    }
}