class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        HashMap<Character,Integer>res=new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=0,windowlen=0,maxfre=0;
        while(right<n)
        {
            char ch=s.charAt(right);
            res.put(ch,res.getOrDefault(ch,0)+1);
            maxfre=Math.max(maxfre,res.get(ch));
            windowlen=right-left+1;
            if(windowlen-maxfre>k)
            {
                char leftch=s.charAt(left);
                res.put(leftch,res.get(leftch)-1);
                left++;

            }
            windowlen=right-left+1;
            maxlen=Math.max(maxlen,windowlen);
            right++;
        }
        return maxlen;
        
    }
}