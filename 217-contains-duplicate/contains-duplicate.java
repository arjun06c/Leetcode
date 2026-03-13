
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer>res=new HashMap<>();
        int n=nums.length;
        int right=0;
        int left=0;
        while(right<n)
        {   if(res.containsKey(nums[right]))
            {
                return true;
            }
            else{
            res.put(nums[right],res.getOrDefault(nums[right],0)+1);
            }
         right++;
        }
        return false;
    }
}