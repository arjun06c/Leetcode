class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Stack<Integer>res=new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        { boolean flag=true;
            for(int j=0;j<m;j++)
            {  
                if(nums1[i]==nums2[j])
                {
                    for(int k=j;k<m;k++)
                    {
                    if(nums1[i]<nums2[k])
                    {
                         ans[i]=nums2[k];
                         flag=false;
                         break;
                    }
                    }
                }
            }
            if(flag)
            {
                ans[i]=-1;
            }
        }
        return ans;
        
    }
}