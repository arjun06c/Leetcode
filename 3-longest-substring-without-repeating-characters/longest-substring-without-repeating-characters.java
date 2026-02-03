class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character,Integer>res=new HashMap<>();
     int n=s.length();
     int left=0;
     int maxi=0;
     int right=0;
     while(right<n)
     {
        char ch=s.charAt(right);
        res.put(ch,res.getOrDefault(ch,0)+1);
        while(res.get(ch)>1)
        {   char leftchar=s.charAt(left);
            res.put(leftchar, res.get(leftchar) - 1);
            left++;
        }
        maxi=Math.max(maxi,right-left+1);
        right++;
     }
     
         return maxi;
    }
}