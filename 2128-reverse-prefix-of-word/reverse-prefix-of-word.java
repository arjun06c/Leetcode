class Solution {
    public String reversePrefix(String word, char ch) {
        String res="";
        String res1="";
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
           
                res+=ans;
                if(ans==ch)
                {  index=i;
                    break;
                }
        }
        StringBuilder sl=new StringBuilder(res).reverse();
        String a=sl.toString();
        for(int i=index+1;i<word.length();i++)
        {  char ans2=word.charAt(i);
            res1+=ans2;
        }
        // System.out.print(a+" "+index);
        // System.out.print(res1+" ");

        return a+res1;
        
    }
}