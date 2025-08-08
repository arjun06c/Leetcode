class Solution {
    public boolean wordPattern(String k, String s) {
        HashMap<Character,String>res1=new HashMap<>();
     
        String arr[]=s.split(" ");
        if(k.length()!=arr.length)
        {
            return false;
        }
        for(int i=0;i<arr.length;i++)
        {  char ch=k.charAt(i);
          
         if(res1.containsKey(ch))
            {
               if(!res1.get(ch).equals(arr[i]))
               {
                return false;
                
               }
            }
            else{
                    
            if(res1.containsValue(arr[i]))
           {
             
                return false;
           }
                res1.put(ch,arr[i]);
            }
        }
        
  return true;
        
    }
}