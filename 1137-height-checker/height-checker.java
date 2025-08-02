class Solution {
    public int heightChecker(int[] arr) {
        int n=arr.length;
     
        int arr2[]=arr.clone();
        for(int i=0;i<n;i++)
        {
            arr2[i]=arr[i];
        }
           Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr2[i])
            {  count+=1;
             System.out.print(arr[i]+" ");
            }
        }
        return count;
    }
}