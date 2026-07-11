class Solution {
    public boolean canJump(int[] nums) {
        int maxval=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxval)
            {
                return false;
            }
            maxval=Math.max(maxval,i+nums[i]);
        }
        return true;
        
    }
}