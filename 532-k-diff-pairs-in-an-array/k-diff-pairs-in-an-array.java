class Solution {
    public int findPairs(int[] arr, int x) {
         Arrays.sort(arr);
        int n=arr.length;
        int left=0;
        int right=1;
        int count=0;
        HashSet<String>res=new HashSet<>();
        while(right<n)
        {
            if(right==left)
            {
                right++;
                continue;
            }
            
            int diff=arr[right]-arr[left];
            
            if(Math.abs(diff)==x)
            {
                    String pair=arr[left] +","+arr[right];
                    if(!res.contains(pair))
                    {
                       res.add(pair);
                       count++;
                    }
                    right++;
            }
            else if(Math.abs(diff)<x)
            {
                right++;
            }
            else{
                left++;
            }
            
        }
        return count;
        
    }
}