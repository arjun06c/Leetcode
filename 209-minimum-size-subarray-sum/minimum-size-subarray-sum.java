class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>res=new HashMap<>();
        int left=0;
        int max=Integer.MAX_VALUE;
        int right=0;
        int sum=0;
        while(right<n)
        {
            sum+=nums[right];
             while(sum>=target)
            {
            max=Math.min(max,(right-left)+1);
             sum-=nums[left];
                left++;
            }
         
            right++;
        }
        if(max==Integer.MAX_VALUE) return 0;
        return max;
        
    }
}