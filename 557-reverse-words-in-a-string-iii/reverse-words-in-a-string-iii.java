class Solution {
    public String reverseWords(String s) {
      String arr[]=s.split(" ");
      StringBuilder res=new StringBuilder();
      for(int i=0;i<arr.length;i++)
      {
        String temp=arr[i];
           res.append(new StringBuilder(temp).reverse());
           if(i<arr.length-1)
           {
              res.append(" ");
           }
      }
         return res.toString();
    }
   
}