class Solution {
    public long[] sumOfThree(long num) {
      long arr[]=new long[3];
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
         else{
            return new  long [0];
         }
      

        return arr;
    }
}