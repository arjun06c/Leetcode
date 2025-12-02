class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++)
        { 
            if(arr[i].equals(" "))
            {
                continue;
            }
        }
     
        return arr[arr.length-1].length();
    }
}