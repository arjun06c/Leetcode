class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
     ArrayList<Integer>res=new ArrayList<>();
       int rlen=arr.length;
       int clen=arr[0].length;
       int top=0;
       int bottom=rlen-1;
       int left=0;
       int right=clen-1;
       
       while(top<=bottom && left<=right)
       {
          for(int i=left;i<=right;i++)
          {
            res.add(arr[top][i]);
          }
          top++;

          for(int i=top;i<=bottom;i++)
          {
            res.add(arr[i][right]);
          }
          right--;
          if(top<=bottom)
          {
            for(int i=right;i>=left;i--)
            {
                res.add(arr[bottom][i]);
            }
          }
          bottom--;
          if(left<=right)
          {
            for(int i=bottom;i>=top;i-- )
            {
                res.add(arr[i][left]);
            }
            left++;
          }

       }



       

    return res;

    }
}