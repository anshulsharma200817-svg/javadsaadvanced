class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int num:nums) {
            if(count==0) candidate=num;
            if(num==candidate) count ++;
            else {
                count--;
            }
        }
        
    return candidate;}
}
class majorityelement {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 2, 3};
        System.out.println(s.majorityElement(nums)); // Output: 3
    }
}