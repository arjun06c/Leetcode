class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        int ind=0;
        int k=0;
        for(int i=n-1;i>=0;i--)
        {
            char ch=num.charAt(i);
            k=ch-'0';
            if(k!=0)
            {
                 ind=i;
                 break;
            }
        }
    
       
        return num.substring(0,ind+1);
        
    }
}