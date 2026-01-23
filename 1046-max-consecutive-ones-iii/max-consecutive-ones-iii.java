class Solution {
    public int longestOnes(int[] nums, int k) {
      int n=nums.length;
      int left=0,right=0,maxlen=0,zcount=0;
      while(right<n)
      {
        if(nums[right]==0)
        {
         zcount++;
        }
        while(zcount>k)
        {
           
           if(nums[left]==0)
           {
           
            zcount--;
           }
        left++;

        }
        maxlen=Math.max(maxlen,right-left+1);
        right++;
      }
      
      return maxlen;
    }
}