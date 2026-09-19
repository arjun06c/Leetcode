class Solution {
    public int removeElement(int[] nums, int val) {
        
      int n=nums.length;
      ArrayList<Integer>res=new ArrayList<>();
      int left=0;
      int right=0;
      while(right<n)
      {
        if(nums[right]!=val)
        {
            res.add(nums[right]);
        }
        right++;
      }
     for(int i=0;i<res.size();i++)
     {
        nums[i]=res.get(i);
     }
return res.size();
    }
}