class Solution {
    public int maxScore(int[] cardPoints, int k) {

     int lsum=0,rsum=0,maxSum=0;
     int n=cardPoints.length;

      for(int ind=0;ind<k;ind++)
      {
        lsum+=cardPoints[ind];
        maxSum=lsum;
      }
      int lside=n-1;
      for(int ind1=k-1;ind1>=0;ind1--)
      {
         lsum-=cardPoints[ind1];
         rsum+=cardPoints[lside];
         lside--;
         maxSum=Math.max(maxSum,lsum+rsum);
      }
      return maxSum;
      





        
    }
}