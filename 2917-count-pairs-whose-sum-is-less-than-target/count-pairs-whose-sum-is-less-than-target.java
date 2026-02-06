class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int left=0;
        int right=1;
        int n=nums.size();
        int count=0;
        int sum=0;
        while(left<n-1)
        {
          sum=nums.get(left)+nums.get(right);
          if(sum<target)
          {
            count++;
          }
          if(right==n-1)
          { 
            right=left+1;
            left++;

          }
          right++;
        }
        return count;
    }
}