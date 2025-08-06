class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String>res=new HashMap<>();
       String []ans=new String[names.length];
        for(int i=0;i<names.length;i++)
        {
            res.put(heights[i],names[i]);
        }
       TreeMap<Integer,String>res2=new TreeMap<>(res);
       int i=0;
       for(int ch:res2.keySet())
       {
          ans[i++]=res2.get(ch);
       }
       String ans2[]=new String[names.length];
       int k=0;
       for(int j=ans.length-1;j>=0;j--)
       {
        ans2[k++]=ans[j];  
       }    
       
       
       return ans2;
    }
}