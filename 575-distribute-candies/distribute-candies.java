class Solution {
    public int distributeCandies(int[] arr) {
        int n=arr.length/2;
        int count=0;
        HashSet<Integer>res=new HashSet<>();
       for(int i=0;i<arr.length;i++)
       {
          res.add(arr[i]);
       }
       int setsize=res.size();
       if(n>setsize)
       {
        return setsize;
       }
       else{
        return n;
       }

     
    }
}