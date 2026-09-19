class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int arr[]=new int [2];
        while(left<right)
        {
            if(nums[left]+nums[right]==target)
            {
               arr[0]=left+1;
               arr[1]=right+1;
            }
             if((nums[left]+nums[right])>target)
            {
                right--;
            }
            else{
                left++;
            }
        }
        return arr;
    }
}