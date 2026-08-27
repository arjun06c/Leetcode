class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>res=new HashMap<>();
        HashMap<Integer,Integer>count=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            res.put(nums[i],res.getOrDefault(nums[i],0)+1);
            if(i>=k)
            {
                int val=nums[i-k];
                res.put(val,res.get(val)-1);
                if(res.get(val)==0)
                {
                    res.remove(val);
                }

            }
            if(i>=k-1)
            {
               for(int x:res.keySet())
               {
                count.put(x,count.getOrDefault(x,0)+1);
               }
            }
        }
        int max=-1;
        for(int x:count.keySet())
        {
            if(count.get(x)==1)
            {
                max=Math.max(max,x);
            }

        }
        return max;
    }
}