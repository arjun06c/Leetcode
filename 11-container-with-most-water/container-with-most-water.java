class Solution {
    public int maxArea(int[] h) {
       int n=h.length;
       int left=0,right=n-1,curr=0,maxi=0;

       while(left<right)
       {
         curr=(right-left)*Math.min(h[left],h[right]);
         if(h[left]<h[right])
         {
            left++;
         }
         else{
            right--;
         }

 
        maxi=Math.max(curr,maxi);
        
       }
       return maxi;
    }
}