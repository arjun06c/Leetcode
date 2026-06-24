class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0;
        int right=0;
        int maxlen=0;
        int maxfre=0;
        HashMap<Character,Integer>res=new HashMap<>();
        while(right<n)
        {
            char ch=s.charAt(right);
            res.put(ch,res.getOrDefault(ch,0)+1);
            maxfre=Math.max(maxfre,res.get(ch));
            while((right-left+1)-maxfre>k)
            {
                char leftch=s.charAt(left);
                res.put(leftch,res.get(leftch)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}