class Solution {
    public boolean isValid(String word) {
         ArrayList<Character>res=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I', 'O','U'));

         int n=word.length();
         if(n<3)
         {
            return false;
         }
         int cot_vow=0;
         int cons_cot=0;
         int num=0;
         for(int i=0;i<n;i++)
         {
            char ch=word.charAt(i);
            if(Character.isLetter(ch))
            {
               if(res.contains(ch))
               {
                System.out.print("vow:"+ch+"\n");
                  cot_vow++;
               }
               else
                {
                    System.out.print("cons:"+ch+"\n");
                  cons_cot++;
                }
            } 
            else if(Character.isDigit(ch))
            {
                num++;
            }
            else
            {
                return false;
            }
         }

          if(cot_vow>=1 &&cons_cot>=1)
          {
            return true;
          }
          else
          {
            return false;
          }
 
    }
}