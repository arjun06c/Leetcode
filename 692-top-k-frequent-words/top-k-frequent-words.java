class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>res=new HashMap<>();
        for(String word:words)
        {
            res.put(word,res.getOrDefault(word,0)+1);
        }
        List<Map.Entry<String,Integer>>temp=new ArrayList<>(res.entrySet());
        temp.sort((a,b)->{
            if(!a.getValue().equals(b.getValue()))
            {
                return b.getValue()-a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });
        List<String>ans=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            ans.add(temp.get(i).getKey());
        }
      return ans;
    }
}