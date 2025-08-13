class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n1=arr1.length;
        int n2=arr2.length;
        int left=0;
        int right=0;
        int count=0;
        boolean flag=true;
        
        while(left<n1 )
        {  
            int sum=Math.abs(arr1[left]-arr2[right]);
            if(sum<=d)
            {
                flag=false;
            }
            if(right==n2-1)
            {
                 if(flag)
                {
                 count++;
                }
                left++;
                right=0;
                flag=true;
               
            }
            else
            {
              right++;
            }
        }
        return count;
        
    }
}