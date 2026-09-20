class Solution {
    public String reverseOnlyLetters(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;
        char arr[]=s.toCharArray();
        String word="";
        while(left<right)
        {
           if(Character.isLetter(arr[left]) && Character.isLetter(arr[right]))
           {
              char temp=arr[left];
              arr[left]=arr[right];
              arr[right]=temp;
              left++;
              right--;
           }
           else if(Character.isLetter(arr[left]) && (!Character.isLetter(arr[right])))
           {
               right--;
           }
          else  if(!(Character.isLetter(arr[left])) && (Character.isLetter(arr[right])))
           {
               left++;
           }
           else{
            right--;
            left++;
           }



        }
        return String.valueOf(arr);
        
    }
}