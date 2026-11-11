class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];
        int[] freq = new int[nums.length];

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            freq[i] = count;
        }

        int index = 0;

        while (index < k) {

            int maxIndex = -1;

            // Find maximum frequency
            for (int i = 0; i < nums.length; i++) {

                if (freq[i] == -1) {
                    continue;
                }

                if (maxIndex == -1 || freq[i] > freq[maxIndex]) {
                    maxIndex = i;
                }
            }

            int selected = nums[maxIndex];

            result[index++] = selected;

            // Mark all occurrences as processed
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == selected) {
                    freq[j] = -1;
                }
            }
        }

        return result;
    }
}