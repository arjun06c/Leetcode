class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder res=new StringBuilder();
        StringBuilder res1=new StringBuilder();
        int index=0;
        Boolean flag=true;
        for(int i=0;i<word.length();i++)
        {
            char k=word.charAt(i);
            if(k==ch)
            {
                flag=false;
            }
        }
        if(flag)
        {
            return word;
        }
        for(int i=0;i<word.length();i++)
        {  
            char ans=word.charAt(i);
           
                res.append(ans);
                if(ans==ch)
                {  index=i;
                    break;
                }
        }
         StringBuilder sl=res.reverse();
        String a=sl.toString();
        for(int i=index+1;i<word.length();i++)
        {  char ans2=word.charAt(i);
            res1.append(ans2);
        }
        String b=res1.toString();
        return a+b;
        
    }
}