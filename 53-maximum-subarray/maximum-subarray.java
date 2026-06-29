class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int current=nums[0];
        int answer=nums[0];
        for(int i=1;i<n;i++)
        {
            current=Math.max(nums[i],current+nums[i]);
            answer=Math.max(current,answer);
        }
        return answer;
    }
}