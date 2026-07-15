class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;
        int m = friends.length;
        HashSet<Integer> res = new HashSet<>();
        int arr[] = new int[m];

        for (int i = 0; i < m; i++) {
            res.add(friends[i]);
        }
        int k=0;
        for (int i = 0; i < n; i++) {
            if (res.contains(order[i])) {
                arr[k++] = order[i];
            }
        }
        return arr;

    }
}