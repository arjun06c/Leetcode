class Solution {
    public int maxVowels(String s, int k) {
    
      int n=s.length();
      HashSet<Character>res=new HashSet<>(Set.of('a','e','i','o','u'));
      int count=0;
      int max=0;
      for(int i=0;i<n;i++)
      {
         char ch=s.charAt(i);
          if(res.contains(ch))
          {
            count++;
          }
          if(i>=k)
          {
            char old=s.charAt(i-k);
            if(res.contains(old))
            {
                count--;
            }
           


          }
          if(i>=k-1)
          {
             max=Math.max(max,count);
          }
      }
        return max;
    }
}