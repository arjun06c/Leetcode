class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<n && k>0;i++)
        {
            if(nums[i]<0)
            {
                nums[i]=-nums[i];
                k--;
            }
        }
       if(k%2!=0)
       {
          int min=100000;
          int index=0;
          for(int i=0;i<n;i++)
          { 
            if(nums[i]<min)
            {
                min=nums[i];
                index=i;
            }
          }
          nums[index]=-min;
       }
       for(int i=0;i<n;i++)
       {
        sum+=nums[i];
        System.out.print(nums[i]+" ");
       }
    
       
       return sum;
    }
}