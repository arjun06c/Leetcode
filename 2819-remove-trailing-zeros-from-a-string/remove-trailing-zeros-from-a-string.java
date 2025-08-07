class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        int ind=0;
        int k=0;
        for(int i=n-1;i>=0;i--)
        {
            char ch=num.charAt(i);
            k=ch-'0';
              System.out.print(k +"");
            if(k!=0)
            {
                 ind=i;
                 break;
            }
        }
        System.out.print(ind+"");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<=ind;i++)
        {
            char ans=num.charAt(i);
            res.append(ans);
        }
        return res.toString();
        
    }
}