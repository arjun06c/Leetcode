class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind1 = -1;
        int ind2 = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind1 = i;
                break;
            }
        }
        if (ind1 == -1) {
            reverse(nums, 0);
        } else {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[ind1]) {
                    ind2 = i;
                    break;
                }
            }
            swap(nums, ind2, ind1);

            reverse(nums, ind1 + 1);
        }

    }

    public void swap(int nums[], int left, int right) {

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

    }

    public void reverse(int nums[], int left) {
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, right, left);
            left++;
            right--;
        }
    }

}