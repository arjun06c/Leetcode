class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        ArrayList<Boolean>res=new ArrayList<>();
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
         if(candies[i]>max)
         {
            max=candies[i];
         }
        }
        System.out.print(max+" ");
        for(int i=0;i<n;i++)
        {
            sum=candies[i]+extraCandies;
            if(sum>=max)
            {
                res.add(true);
            }
            else
            {
               res.add(false);
            }
        }

            return res;

        
    }
}