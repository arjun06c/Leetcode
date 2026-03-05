class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        
        int k = arr.length;
        if(n == 0) return true;
        
        for(int i = 0; i < k; i++)
        {
            if(arr[i] == 0)
            {
                if((i == 0 || arr[i-1] == 0) && 
                   (i == k-1 || arr[i+1] == 0))
                {
                    arr[i] = 1;
                    n--;
                }
            }
        }
        
        if(n <= 0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}