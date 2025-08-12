class Solution {
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        int step1=0;
        int step2=0;
        for(int i=0;i<n;i++)
        {
            char ch=moves.charAt(i);
            if(ch=='R')
            {
                step1++;
            }
            else if(ch=='L')
            {
                step1--;
            }
            else if(ch=='U')
            {
                step2++;
            }
            else if(ch=='D')
            {
                step2--;
            }
        }
        return step1==0 && step2==0;
    }
}