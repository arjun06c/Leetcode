class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int n=s.length();
        int left=0;
        int right=0;
        int windowlen=0;
        int maxlen=0;
        int maxfreq=0;
        HashMap<Character,Integer>res=new HashMap<>();
       while(right<n)
       {
        char ch=s.charAt(right);
         res.put(ch,res.getOrDefault(ch,0)+1);
         maxfreq=Math.max(maxfreq,res.get(ch));
         windowlen=right-left+1;
         if(windowlen-maxfreq>k)
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