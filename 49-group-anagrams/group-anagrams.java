class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>res=new HashMap<>();
        for(String word:strs)
        {
            char ch[]=word.toCharArray();
            Arrays.sort(ch);
            String sorted=String.valueOf(ch);
            if(!res.containsKey(sorted))
            {
                res.put(sorted,new ArrayList<String>());
            }
            res.get(sorted).add(word);

        }
        return new ArrayList<>(res.values());
        
    }
}