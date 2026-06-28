class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int pre=0;
        HashMap<Integer,Integer>res=new HashMap<>();
        if(nums.length<=1)
        {
            return false;
        }
        res.put(0,-1);
        for(int i=0;i<n;i++)
        {
            pre+=nums[i];
            int rem=pre%k;

            if(res.containsKey(rem))
            {  
                if((i)-(res.get(rem))>=2)
               {
                return true;
               }
            
            }
            else{
            
             res.put(rem,i);}
        
        }
        return false;
    }
}