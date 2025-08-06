class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> res1=new HashMap<>();
     
        int max1=0;
        int max2=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
                if(res1.containsKey(ch))
                {
                 res1.put(ch,res1.get(ch)+1);
                }
                else{
                    res1.put(ch,1);
                }
            
        }
        for(char num:res1.keySet())
        {
            if(num=='a'||num=='e'||num=='i'||num=='o'||num=='u')
            {
                if(res1.get(num)>max1)
                {
                    max1=res1.get(num);
                }
            }
            else if(num!='a'||num!='e'||num!='i'|| num!='o'||num!='u')
            {
                if(res1.get(num)>max2)
                {
                    max2=res1.get(num);
                }
            }
        }
      
        return max1+max2;
    }
}