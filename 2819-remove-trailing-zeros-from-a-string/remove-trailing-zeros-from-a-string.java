class Solution {
    public String removeTrailingZeros(String num) {
        int size=num.length();
        int k=0;
        int ind=0;
        for(int i=size-1;i>=0;i--)
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