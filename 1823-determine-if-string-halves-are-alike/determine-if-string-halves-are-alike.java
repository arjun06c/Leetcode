class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        Set<Character>vow=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int count1=0;
        int count2=0;
        for(int i=0;i<n/2;i++)
        {
            if(vow.contains(s.charAt(i)))
            {
                count1+=1;
            }
        }
        for(int i=n/2;i<n;i++)
        {
            if(vow.contains(s.charAt(i)))
            {
                count2+=1;
            }
        }
        if(count1==count2)
        {
            return true;
        }
        else
        {
            return false;
        }
       
        
    }
}