class Solution {
    public int canBeTypedWords(String text, String Letters) {
        String arr[]=text.split(" ");
        int count=0;
      
        for(int i=0;i<arr.length;i++)
        {   boolean flag=true;
             for(int j=0;j<Letters.length();j++)
              {           
                 if(arr[i].contains(String.valueOf(Letters.charAt(j))))
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