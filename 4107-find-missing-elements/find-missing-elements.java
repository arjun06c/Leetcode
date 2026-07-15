class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int start=0;
        int end=0;
        for(int i=0;i<n-1;i++)
        {
            int val=nums[i+1]-nums[i];
            if(val>1)
            {
                start=nums[i];
                end=nums[i+1];
             for(int j=start+1;j<end;j++ )
        {
            res.add(j);
        }
            }
        }
       
        return res;
    }
}