class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        double product = 1;
        int left = 0;
        int result = 0;

        if (k <= 1)
            return 0;

        for (int right = 0; right < nums.length; right++) {
            product = nums[right] * product;

            while (left <= right && product >= k) {
                product = product / nums[left];
                left++;
            }

            result += right - left + 1;
        }
        return result;
    }
}