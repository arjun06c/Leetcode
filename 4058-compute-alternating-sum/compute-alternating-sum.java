class Solution {
    public int alternatingSum(int[] nums) {
        int n=nums.length;
        int odd=0;
        int even=0;
        for(int i=1;i<n;i++)
        {
              if(i%2==0)
              {
                odd+=nums[i-1];
              }
              else{
                even+=nums[i-1];
              }
        }
         if(n%2==0)
         {
             odd+=nums[n-1];
         }
        else{
             even+=nums[n-1];
        }
        System.out.println(odd);
        System.out.print(even);
        return even-odd;
        
    }
}