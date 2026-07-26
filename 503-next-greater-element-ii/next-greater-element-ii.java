class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer>res=new Stack<>();
        int arr[]=new int[n];
        int k=0;
        for(int i=2*n-1;i>=0;i--)
        {
            while(!res.isEmpty()&& res.peek()<=nums[i%n])
            {
                res.pop();
            }
            if(i<n)
            {
                if(res.isEmpty()) arr[i%n]=-1;
                else{
                    arr[i%n]=res.peek();
                }
            }
            res.push(nums[i%n]);
        }
        return arr;
    }
}