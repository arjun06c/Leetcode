class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        int jump_count=0;
        while(right<n-1)
        {        int maxval=right;

            for(int i=left;i<=right;i++)
            {
                if((nums[i]+i)>maxval)
                {
                    maxval=nums[i]+i;
                }
               
            }
             left=right+1;
                right=maxval;
                jump_count++;
            
        }
                    return jump_count;

    }
}