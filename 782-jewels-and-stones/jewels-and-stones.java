class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>res=new HashMap<>();
        int count=0;
        for(int i=0;i<stones.length();i++)
        {
            char ch=stones.charAt(i);
            res.put(ch,res.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<jewels.length();i++)
        {
            char ch=jewels.charAt(i);
            if(res.containsKey(ch))
            {
            count=count+(res.get(ch));
            }
        }
        return count;
    }
}