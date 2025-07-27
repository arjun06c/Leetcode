class Solution {
    public int tribonacci(int n) {
       
          int memo[]=new int[n+1];
       Arrays.fill(memo,-1);
       return fun(n,memo);
    }
    public int fun(int n,int []memo)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1||n==2)
        {
            return 1;
        }
        if(memo[n]!=-1)
        {
            return memo[n];
        }
        int ans=fun(n-1,memo)+fun(n-2,memo)+fun(n-3,memo);
        memo[n]=ans;
        return ans;
        
        
    }
}