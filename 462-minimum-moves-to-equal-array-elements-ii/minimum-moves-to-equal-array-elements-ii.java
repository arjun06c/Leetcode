class Solution {
    public int minMoves2(int[] arr) {
        int n=arr.length;
        int sum=0;
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
      int mid=0;
        mid=arr[n/2];

        for(int i=0;i<n;i++)
        {
            sum+=Math.abs(arr[i]-mid);
        }
        return sum;
        
    }
}