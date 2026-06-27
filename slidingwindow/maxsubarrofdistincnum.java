class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        int l = 0;

        long sum = 0;
        long maxSum = 0;

        // Build the first window
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
        }

        // Check the first window
        if (map.size() == k) {
            maxSum = sum;
        }

        // Slide the window
        for (int r = k; r < n; r++) {

            // Remove left element
            sum -= nums[l];
            map.put(nums[l], map.get(nums[l]) - 1);
            if (map.get(nums[l]) == 0) {
                map.remove(nums[l]);
            }
            l++;

            // Add right element
            sum += nums[r];
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // Update answer if all elements are distinct
            if (map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
class maxsubarrofdistincnum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(s.maximumSubarraySum(nums, k)); // Output: 12
    }
}