class Solution {
    public int maximumDifference(int[] prices) {
        int n=prices.length;
        int minval=Integer.MAX_VALUE;
        int maxval=-1;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<minval)
            {
                minval=prices[i];
            }
            if(minval<prices[i])
            {
              maxval=Math.max(maxval,prices[i]-minval);
            }
        }
        return maxval;
    }
}