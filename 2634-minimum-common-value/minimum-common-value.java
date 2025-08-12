class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int left=0;
      int right=0;
        int ans=0;
        while(left<nums1.length && right<nums2.length)
        {
            if(nums1[left]==nums2[right])
            {
              return nums2[right];
            }
            else if(nums1[left]<nums2[right])
            {
                left++;
            }
            else if(nums1[left]>nums2[right])
            {
                right++;
            }
        }
    return -1;
        
    }
}