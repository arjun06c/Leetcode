class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int ans=(nums[0]*nums[1])-(nums[nums.length-2]*nums[nums.length-1]);
        if(ans<0)
        {
            ans=-1*ans;
        }
        return ans;
        
    }
}