import java.util.Arrays;

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);

        arr[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }

        return arr[arr.length - 1];
    }
}
class maximumElementAfterDecrementingAndRearranging {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2, 2, 1, 2, 1};
        System.out.println(s.maximumElementAfterDecrementingAndRearranging(arr)); // Output: 3
    }
}