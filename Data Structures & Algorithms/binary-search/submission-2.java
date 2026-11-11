class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int low, int high) {

        // Base case: Element not found
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        // Target found
        if (nums[mid] == target) {
            return mid;
        }

        // Search left half
        if (nums[mid] > target) {
            return binarySearch(nums, target, low, mid - 1);
        }

        // Search right half
        return binarySearch(nums, target, mid + 1, high);
    }
}