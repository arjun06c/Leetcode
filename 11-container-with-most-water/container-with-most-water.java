class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=n-1;
        while(left<right)
        {
           int width=right-left;
           int high=Math.min(height[left],height[right]);
           max=Math.max(max,width*high);
            
            if(height[left]<height[right])
            {
                left++;
            }
            else{
                right--;
            }


        }
        return max;
    }
}