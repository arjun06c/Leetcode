class Solution {
    public boolean isHappy(int n) {
     
          boolean flag=true;
          int sum;
          HashSet<Integer>res=new HashSet<>();
       
         while(true)
         {     sum=0;
            while(n>0)
            {
                int digit=n%10;
                sum=sum+digit*digit;
                n/=10;
                
            }
            System.out.print(sum+" ");
            if(sum==1)
            {
                flag=false;
                break;
            }
            if(res.contains(sum))
            {
                break;
            }
            res.add(sum);
           
                n=sum;
            
         }
         if(!flag)
         {
            return true;
         }
         else
         {
            return false;
         }
    }
}