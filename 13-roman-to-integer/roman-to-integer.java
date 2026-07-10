class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> res = new HashMap<>();
        res.put('I', 1);
        res.put('V', 5);
        res.put('X', 10);
        res.put('L', 50);
        res.put('C', 100);
        res.put('D', 500);
        res.put('M', 1000);
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i+1<s.length() && res.get(ch)<res.get(s.charAt(i+1)) )
            {
               ans+=res.get(s.charAt(i+1))-(res.get(ch));
               i+=1;
            }
            else{
                ans+=res.get(ch);
            }
        }
      return ans;
    }
}