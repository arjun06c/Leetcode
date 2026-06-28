class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int pre=0;
        HashMap<Integer,Integer>res=new HashMap<>();
        res.put(0,1);
        int count=0;
        for(int i=0;i<n;i++)
        {
            pre+=nums[i];
            int rem=pre%k;
            if(rem<0)
            {
                rem+=k;
            }
            if(res.containsKey(rem))
            {
                count+=res.get(rem);
            }
            res.put(rem,res.getOrDefault(rem,0)+1);
        }
        return count;
        
    }
}