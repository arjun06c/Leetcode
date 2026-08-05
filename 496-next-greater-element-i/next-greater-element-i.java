class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> res=new HashMap<>();
        Stack<Integer>st=new Stack<>();
                int n=nums1.length;
        int ans[]=new int[n];
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=nums2[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                res.put(nums2[i],-1);
            }
            else{
                res.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
            
        }
        for(int j=0;j<n;j++)
            {
              ans[j]=res.get(nums1[j]);
            }
        return ans;
        
    }
}