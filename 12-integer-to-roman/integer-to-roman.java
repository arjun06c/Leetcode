class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> res = new HashMap<>();
        res.put(1, "I");
        res.put(4, "IV");
        res.put(5, "V");
        res.put(9, "IX");
        res.put(10, "X");
        res.put(40,"XL");
        res.put(50, "L");
        res.put(90,"XC");

         res.put(100, "C");
        res.put(400,"CD");
       
        res.put(500, "D");
        res.put(900,"CM");
        res.put(1000, "M");

        int arr[] = new int[] { 1000,900, 500,400, 100,90, 50,40, 10, 9, 5, 4, 1 };
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= num) {
                int val = num / arr[i];
                num = num % arr[i];
                for (int j = 0; j < val; j++) {
                    ans += res.get(arr[i]);
                }
            }
        }
        return ans;
    }
}