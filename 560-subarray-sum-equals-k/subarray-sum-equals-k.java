class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>res=new HashMap<>();
        res.put(0,1);
        int prefix=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
           prefix+=nums[i];
           int val=prefix-k;
           if(res.containsKey(val))
           {
            count+=res.get(val);
           }
        res.put(prefix,res.getOrDefault(prefix,0)+1);

        }
        return count;
    }
}