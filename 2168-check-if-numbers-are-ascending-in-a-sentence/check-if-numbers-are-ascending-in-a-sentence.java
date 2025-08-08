import java.util.regex.*;
class Solution {
    public boolean areNumbersAscending(String s) {
     ArrayList<Integer>res=new ArrayList<>();
        Pattern p = Pattern.compile("\\d+"); 
        Matcher m = p.matcher(s);
        
        while (m.find()) {
            res.add(Integer.valueOf(m.group()));
        }
        int max=res.get(0);
        System.out.print(max+"");
        for(int i=1;i<res.size();i++)
        {
            if(res.get(i)>max)
            {
                max=res.get(i);
            }
            else
            {
                return false;
            }
        }
        

       return true;
        
    }
  
}