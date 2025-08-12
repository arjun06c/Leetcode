class Solution {
    public String reverseWords(String s) {
        String res=s.trim().replaceAll("\\s+", " ");
        String word[]=res.split(" ");
        int left=0;
        int right=word.length-1;
        while(left<right)
        {
            String temp=word[left];
            word[left]=word[right];
            word[right]=temp;
            left++;
            right--;
        }
        String ans=String.join(" ",word);
        return ans;
    }
}