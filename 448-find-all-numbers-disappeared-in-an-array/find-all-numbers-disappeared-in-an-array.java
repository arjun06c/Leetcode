
import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
       Arrays.sort(nums);
       HashSet<Integer> map=new HashSet<>();
       ArrayList<Integer>res=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
            map.add(nums[i]);
       }
       for(int j=1;j<=n;j++)
       {
        if(!map.contains(j))
        {
            res.add(j);
        }
       }
       return res;
        
    }
}