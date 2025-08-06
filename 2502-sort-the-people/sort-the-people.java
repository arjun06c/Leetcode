class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String>res=new HashMap<>();
       String []ans=new String[names.length];
        for(int i=0;i<names.length;i++)
        {
            res.put(heights[i],names[i]);
        }
      Arrays.sort(heights);
       String ans2[]=new String[names.length];
       int k=0;
       for(int i= heights.length-1;i>=0;i--)
       {
        ans2[k++]=res.get(heights[i]);
       }  
       return ans2;
    }
}