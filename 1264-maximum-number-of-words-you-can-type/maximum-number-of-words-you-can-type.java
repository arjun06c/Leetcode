class Solution {
    public int canBeTypedWords(String text, String Letters) {
        String arr[]=text.split(" ");
        int count=0;
        HashSet<Character>res=new HashSet<>();
        for(char ch:Letters.toCharArray())
        {
            res.add(ch);
        }
      
        for(String word:arr)
        {   boolean flag=true;
             for(char ch:word.toCharArray())
              {           
                 if(res.contains(ch))
               {  
                flag=false;
                break;
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