class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int numzeroes=0;
        int l=0;
        int n=nums.length;
        for(int r=0;r<n;r++) {
            if(nums[r]==0) numzeroes++;
            while(numzeroes>k) {
                if(nums[l]==0) numzeroes--;
                l+=1;
            }
            max=Math.max(max,r-l+1);
        }
        
    return max;
    }
}
class conseecutiveones3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k = 2;
        System.out.println(s.longestOnes(nums, k)); // Output: 6
    }
}