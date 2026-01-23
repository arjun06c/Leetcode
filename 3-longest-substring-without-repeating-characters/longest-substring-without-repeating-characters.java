class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character,Integer>res=new HashMap<>();
     int left=0,maxlen=0;
     for(int right=0;right<s.length();right++)
     {
        char ch=s.charAt(right);

          if(res.containsKey(ch))
          {
            left=Math.max(left,res.get(ch)+1);
          }
          res.put(ch,right);
          maxlen=Math.max(maxlen,right-left+1);
         

     }
  return maxlen;
        
    }
}