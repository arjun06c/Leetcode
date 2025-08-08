class Solution {
    public boolean checkIfPangram(String s) {
        HashSet<Character>res=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            res.add(s.charAt(i));
        }
        if(res.size()==26)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}