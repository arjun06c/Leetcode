class Solution {
    public boolean isValid(String s) {
        Stack<Character>res=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(' ||ch=='['||ch=='{')
            {
                res.push(ch);
            }
            else{
                 if(res.isEmpty()) return false;
                 
            
            char word=res.pop();
            if(word=='['&&ch!=']') return false;
             if(word=='(' &&ch!=')') return false;
           
             if(word=='{'&&ch!='}') return false;
           
            }
        }
        return res.isEmpty();
    }
}