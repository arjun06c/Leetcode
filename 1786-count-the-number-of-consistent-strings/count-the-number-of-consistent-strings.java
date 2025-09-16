class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>res=new HashSet<>();
        for(char ch:allowed.toCharArray())
        {
          res.add(ch);
        }
        int count=0;
    
    for(String word:words)
    { boolean flag=true;
        for(char ch:word.toCharArray())
        {
            if(!res.contains(ch))
            {
                flag=false;
            }
        }
        if(flag)
        {
            count++;
        }
    }
    return count;
    }
}