class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        HashMap<Integer,Integer>res=new HashMap<>();
        int left=0;
        int max=0;
        int right=0;
        while(right<n)
        {
            res.put(fruits[right],res.getOrDefault(fruits[right],0)+1);
            while(res.size()>2)
            {
                res.put(fruits[left],res.get(fruits[left])-1);
                if(res.get(fruits[left])==0)
                {
                    res.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max,(right-left)+1);
            right++;
        }
        return max;
        
    }
}