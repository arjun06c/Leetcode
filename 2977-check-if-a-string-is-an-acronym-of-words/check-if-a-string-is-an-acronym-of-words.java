class Solution {
    public boolean isAcronym(List<String> words, String s) {
      int n=s.length();
      int m=words.size();
      if(n!=m)
      {
        return false;
      }
        for(int i=0;i<words.size();i++)
        {
            char ch=s.charAt(i);
             if(ch!=words.get(i).charAt(0))
             {
                return false;
             }

        }
        return true;
        
    }
}