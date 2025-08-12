class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        boolean flag=true;
        for(int i=0;i<n;i++)
        {  
            for(int j=0;j<n;j++)
            {
                if(i!=j && arr[i]==arr[j]*2)
                {
                    flag=false;
                    break;
                }

            }
        }
        if(!flag)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}