class Solution {
    public int numberOfSubstrings(String s) {
        return atmost(s,3)-atmost(s,3-1);
        
    }
    private int atmost(String s ,int goal)
    {
        int n=s.length();
        HashMap<Character,Integer>res=new HashMap<>();
        int left=0,right=0,count=0;
        while(right<n)
        {
            char ch=s.charAt(right);
            res.put(ch,res.getOrDefault(ch,0)+1);
            while(res.size()>goal)
            {
                char leftch=s.charAt(left);
                res.put(leftch,res.get(leftch)-1);
                if(res.get(leftch)==0)
                {
                    res.remove(leftch);
                }
                left++;
            }
            count+=(right-left+1);
            right++;
        }
        return count;

    }
}