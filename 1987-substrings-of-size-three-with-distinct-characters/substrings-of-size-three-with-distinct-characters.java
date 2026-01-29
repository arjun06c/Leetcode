class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        int count=0;
        int left=0;
         for(int right=0;right<n;right++)
         {

            if(right-left+1==3)
            {
            int a=s.charAt(left);
            int b=s.charAt(left+1);
            int c=s.charAt(left+2);
            if(a!=b && b!=c && a!=c)
             {
                count++;
             }
            left++;

            }
         }
            
       
        return count;
    }
}