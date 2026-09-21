class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=1;
        int count=1;
        int temp=1;

        while(right<n)
        {
            if(nums[left]==nums[right] && count<2)
            {
               nums[temp]=nums[right];
               temp++;
               count++;
               left++;
               right++;

            }
            else if(nums[left]==nums[right] && count>=2)
            {
                left++;
                right++;
            }
            else
            {  
                nums[temp]=nums[right];
                temp++;
                count=1;
                left++;
                right++;
            }

        }
               
        return temp;

    }
}