class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left=0;
        int right=nums.length-1;
        ArrayList<Long>res=new ArrayList<>();
       long total=0;
        String sum="";
        long grand=0;
        while(left<right)
        {
            sum="";
           total=0;
            
         sum=String.valueOf(nums[left]);
         sum+=String.valueOf(nums[right]);
          total=Integer.parseInt(sum);
         grand+=total;
         right--;
         left++;
         
            
        }
        if(nums.length%2!=0)
        {
            grand+=nums[nums.length/2];
        }
        return grand;
    }
}