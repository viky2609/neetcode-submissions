
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        boolean[] visited = new boolean[nums.length];

        int[][] freq = new int[nums.length][2];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            freq[index][0] = nums[i];
            freq[index][1] = count;

            index++;
        }

        // Sort by frequency in descending order
        Arrays.sort(freq, 0, index,
            (a, b) -> Integer.compare(b[1], a[1]));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = freq[i][0];
        }

        return result;
    }
}
