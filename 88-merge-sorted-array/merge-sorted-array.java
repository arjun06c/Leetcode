class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
      int right=0;
      int left=0;
      ArrayList<Integer>res=new ArrayList<>();
      while(right<m && left<n)
      {
        if(nums1[right]<=nums2[left] )
        {
            res.add(nums1[right]);
            right++;
        }
         if(nums1[right]>nums2[left])
         {
            res.add(nums2[left]);
            left++;
        }

      } 
      while(right<m)
      {
        res.add(nums1[right]);
        right++;
      }
      while(left<n)
      {
        res.add(nums2[left]);
        left++;
      }
      for(int i=0;i<res.size();i++)
      {
        nums1[i]=res.get(i);
      }



    }
}