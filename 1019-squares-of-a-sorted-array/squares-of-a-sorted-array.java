class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n=nums.length;
        int right=0;
        while(right<n)
        {
            nums[right]*=nums[right];
            right++;
        }
         Arrays.sort(nums);

        return nums;

    }
}