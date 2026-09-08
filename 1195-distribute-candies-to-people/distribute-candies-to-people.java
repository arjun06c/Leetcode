class Solution {
    public int[] distributeCandies(int candies, int n) {
        int arr[]=new int[n];
        int k=1;
        int i=0;
    while(candies>0)
        { 
            if(candies>=k)
            {
                
            arr[i]+=k;
            candies=candies-k;
            

            }
            else{
                arr[i]+=candies;
                candies=0;
            }
            k++;
            i++;
            if(i==n)
            {
                i=0;
            }
            
        }
        return arr;
        
    }
}