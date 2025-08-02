class Solution {
    public long[] sumOfThree(long num) {
      long arr[]=new long[3];
       if(num%3!=0)
       {
        return new long[0];
       }
        long ans=num/3;
         long a1=ans-1;
         long a2=ans;
         long a3=ans+1;
         long sum=a1+a2+a3;
  System.out.print(sum+"");
         if(sum==num)
         {
            arr[0]=a1;
            arr[1]=a2;
            arr[2]=a3;
         }
         
      

        return arr;
    }
}