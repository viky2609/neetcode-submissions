class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while (j > i) {
                if (nums[i] == nums[j]) {
                    return true;
                }
                j--;
            }
        }

        return false;
    }
}