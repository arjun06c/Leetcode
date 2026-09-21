class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=1;
        int count=1;

        ArrayList<Integer>res=new ArrayList<>();
        while(right<n)
        {
            if(nums[left]==nums[right] && count<2)
            {
               res.add(nums[left]);
               count++;
               left++;
               right++;

            }
            else if(nums[left]==nums[right] && count>=2)
            {
                left++;
                right++;
            }
            else if(nums[left]!=nums[right])
            {
                res.add(nums[left]);
                count=1;
                left++;
                right++;
            }

        }
          res.add(nums[n-1]);
            for(int i=0;i<res.size();i++)
            {
                nums[i]=res.get(i);
            }
        return res.size();

    }
}