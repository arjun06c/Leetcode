class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        String word1=new String(arr);
        char arr2[]=t.toCharArray();
        Arrays.sort(arr2);
        String word2=new String(arr2);
        if(word1.equals(word2))
        {
            return true;
        }
        
      
        return false;
    }
}