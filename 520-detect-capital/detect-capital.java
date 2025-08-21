class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int lcount=0;
        int ucount=0;
        int fcount=0;
        int ocount=0;
        for(int i=0;i<n;i++)
        {   char first=word.charAt(0);
            char ch=word.charAt(i);

             if(Character.isUpperCase(first))
            {
                 if(Character.isLowerCase(ch))
                  {
                   fcount++;
                 }

            }
            if(Character.isUpperCase(ch))
            {
                ucount++;
            }
            else if(Character.isLowerCase(ch))
            {
                lcount++;
            }
           
            else
            {
                ocount++;
            }
        }
        if(n==ucount||n==lcount||n==ocount||n==fcount+1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}