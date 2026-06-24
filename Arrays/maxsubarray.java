class Solution {
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
class MaxSubArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = sol.maxSubArray(nums);
        System.out.println(result);
    }
}
// keep the intuition does previous sum help in calculating current sum? if yes, how? if no, why not? and would it hurt me to keep it? if yes, how? if no, why not