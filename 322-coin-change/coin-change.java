class Solution {
    public int coinChange(int[] coins, int amount) {
        int minAmount[]=new int[amount+1];
        if (amount<0) return 0;
        for(int i=1;i<=amount;i++)
        {
            minAmount[i]=Integer.MAX_VALUE;
            for(int coin:coins)
            {
                if(i>=coin && minAmount[i-coin]!=Integer.MAX_VALUE)
                {
                    minAmount[i]=Math.min(minAmount[i],minAmount[i-coin]+1);
                }
            }
        }
        if(minAmount[amount]==Integer.MAX_VALUE) return -1;
        return minAmount[amount];
    }
}