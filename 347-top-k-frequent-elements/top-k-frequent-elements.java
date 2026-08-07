class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>res=new HashMap<>();
        for(int num:nums)
        {
            res.put(num,res.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>>temp=new ArrayList<>(res.entrySet());
        temp.sort((a,b)->b.getValue()-a.getValue());
        int ans[]=new int [k];
        for(int i=0;i<k;i++)
        {
            ans[i]=temp.get(i).getKey();
        }
        return ans;
        
    }
}