class Solution {
    public int removeDuplicates(int[] arr) {
        int left=0;
        int right=1;
        int k=0;
        int count=0;
        while(right<arr.length)
        {
            if(arr[left]<arr[right])
            {
                arr[k++]=arr[left];
                count++;
                left++;
                right++;
            }
            else{
                left++;
                right++;
            }
        }
        arr[k]=arr[right-1];
        
     return count+1;
        
    }
}