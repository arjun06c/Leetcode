class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int pre=0;
        HashMap<Integer,Integer>res=new HashMap<>();
        int count=0;
        res.put(0,1);
        for(int i=0;i<n;i++)
        {
            pre+=nums[i];
            int val=pre-k;
            if(res.containsKey(val))
            {
                count+=res.get(val);
            }
            res.put(pre,res.getOrDefault(pre,0)+1);
        }
        return count;
        
    }
}