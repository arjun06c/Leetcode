class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int evensum=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                evensum+=nums[i];
            }
        }
        int arr[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int val=queries[i][0];
            int index=queries[i][1];
             if(nums[index]%2==0)
             {
                evensum-=nums[index];
             }
             nums[index]+=val;
             if(nums[index]%2==0)
             {
                evensum+=nums[index];
             }
             arr[i]=evensum;
        }
    return arr;
    }
}