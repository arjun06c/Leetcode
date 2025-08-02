class Solution {
    public int heightChecker(int[] arr) {
        int arr2[]=arr.clone();
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr2[i])
            {  count+=1;
            
            }
        }
        return count;
    }
}