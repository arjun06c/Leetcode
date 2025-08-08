class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>res=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(res.containsKey(ch))
            {
               res.put(ch,res.get(ch)+1);
            }
            else{
                res.put(ch,1);
            }
        }
        int temp=res.get(s.charAt(0));
    
        for(char num:res.keySet())
        {
            if(res.get(num)!=temp)
            {
                return false;
            }
        }
          return true;
    }
  
}