class Solution {
    public boolean isSameAfterReversals(int num) {
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int digit=num%10;
            sum=sum*10+digit;
            num/=10;
        }
        int copy=sum;
        int sum1=0;
        while(copy>0)
        {
            int digit1=copy%10;
            sum1=sum1*10+digit1;
            copy/=10;
        }
        if(sum1==temp)
        {
            return true;
        }
        else{
            return false;
        }

        
    }
}