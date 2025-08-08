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
     ArrayList<Integer>ans=new ArrayList<>();
        for(char num:res.keySet())
        {  
           ans.add(res.get(num));
        }
        int temp=ans.get(0);
        for(int i=0;i<ans.size();i++)
        {
            if(ans.get(i)!=temp)
            {
                return false;
            }
        }
          return true;
    }
  
}