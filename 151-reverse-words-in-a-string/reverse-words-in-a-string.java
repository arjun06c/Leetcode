class Solution {
    public String reverseWords(String s) {
        String res=s.trim().replaceAll("\\s+", " ");
        String word[]=res.split(" ");
        int left=0;
        int right=word.length-1;
        System.out.print(right+" ");
        while(left<right)
        {
            String temp=word[left];
               System.out.print(word[left]+"\n ");
            word[left]=word[right];
              System.out.print(word[right]+" \n");
            word[right]=temp;
            left++;
            right--;
        }
        String ans=String.join(" ",word);
        return ans;
    }
}