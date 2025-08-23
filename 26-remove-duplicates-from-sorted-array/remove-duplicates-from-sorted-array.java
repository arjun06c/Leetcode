class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=1;
        int count=0;
        int k=0;

        while(right<n)
        {
            if(nums[right]!=nums[left])
            {
                count++;
                nums[k++]=nums[left];
                left=right;
                right++;
            }
            else
            {
                right++;
            }
        }
        nums[k]=nums[right-1];
        return count+1;
        
    }
}