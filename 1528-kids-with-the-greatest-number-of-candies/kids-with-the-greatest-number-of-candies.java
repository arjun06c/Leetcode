class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        int n=arr.length;
        ArrayList<Boolean>res=new ArrayList<>();
       
        int sum=0;
      int max=0;

        for(int i=0;i<n;i++)
        { 
          if(arr[i]>max)
          {
            max=arr[i];
          }
        }
       for(int i=0;i<n;i++)
       {
          sum=arr[i]+extraCandies;
          if(sum>=max)
          {
            res.add(true);
          }
          else{
            res.add(false);
          }
       }


        return res;
        
    }
}