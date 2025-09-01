class Solution {
    public int mySqrt(int n) {
        long low=1;
        long high=n;
     
        while(low<=high)
        {
                long mid=(high+low)/2;
               long val=mid*mid;
            if(val<=n)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)high;
    }
}