class Solution {
    public int strStr(String s1, String s2) {
        if(s2.length()==0)
        {
            return 0;
        }
        
    for(int i=0;i<s1.length()-s2.length()+1;i++)
    {
        if((s1.charAt(i))==(s2.charAt(0)))
        {
            if(s1.substring(i,i+s2.length()).equals(s2))
            {
                return i;
            }
        }
    }
    return -1;
        
    }
}