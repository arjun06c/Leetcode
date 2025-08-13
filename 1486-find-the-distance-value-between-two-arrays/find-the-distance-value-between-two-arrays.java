class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n1=arr1.length;
        int n2=arr2.length;
        int count=0;
        for(int i=0;i<n1;i++)
        {   int temp=arr1[i];
           boolean flag=true;
            for(int j=0;j<n2;j++)
            {
               int sum=Math.abs(arr1[i]-arr2[j]);
               if(sum<=d)
               {
                   flag=false;
               }
            }
            if(flag)
            {
                count+=1;
            }
        }
        return count;
        
    }
}