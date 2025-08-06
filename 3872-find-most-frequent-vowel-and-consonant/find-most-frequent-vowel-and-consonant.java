class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> res1=new HashMap<>();
        HashMap<Character,Integer>res2=new HashMap<>();
        int max1=0;
        int max2=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                if(res1.containsKey(ch))
                {
                 res1.put(ch,res1.get(ch)+1);
                }
                else{
                    res1.put(ch,1);
                }
            }
        }
        for(char num:res1.keySet())
        {
            if(res1.get(num)>max1)
            {
                max1=res1.get(num);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
            {
                if(res2.containsKey(ch))
                {
                 res2.put(ch,res2.get(ch)+1);
                }
                else{
                    res2.put(ch,1);
                }
            }
        }
         for(char n:res2.keySet())
        {
            if(res2.get(n)>max2)
            {
                max2=res2.get(n);
            }
        }
       
        return max1+max2;
    }
}