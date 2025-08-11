class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int fru_size=fruits.length;
        int bask_size=baskets.length;
        int count=0;
        for(int i=0;i<fru_size;i++)
        { 
            boolean flag=false;
            for(int j=0;j<bask_size;j++)
            {
                
                if(fruits[i]<=baskets[j])
                {
                    baskets[j]=-1;
                    flag=true;
                    break;

                }
            }
            if(!flag)
            {
                count+=1;
            }
        }
        return count;
    }
}