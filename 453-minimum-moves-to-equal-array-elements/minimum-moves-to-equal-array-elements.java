class Solution {
    public int minMoves(int[] arr) {
        int n=arr.length;
        int min=arr[0];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i]-min;
        }
        return sum;
    }
}