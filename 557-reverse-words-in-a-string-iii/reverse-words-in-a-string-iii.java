class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb1=new StringBuilder();
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
           String ans=new StringBuilder(arr[i]).reverse().toString();
            sb1.append(ans);
            if(i!=arr.length-1)
            {
                sb1.append(" ");
            }
        }
        return sb1.toString();
    }
}