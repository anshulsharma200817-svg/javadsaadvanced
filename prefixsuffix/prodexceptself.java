/* prefi-suffix intuition for every index i take left product and right product and multiply them to get the answer for index i
so we will make two arrays left and right and store the product of all elements to the left of index i in left[i] and product of all elements to the right*/ of index i in right[i] and then multiply them to get the answer for index i*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // for any index i take prefix i and suffix i for product and multiply them boith to get the answer
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        
        for(int i=1;i<n;i++) {
        ans[i]=ans[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int j=n-1;j>=0;j--) {
         ans[j]*=suffix;
         suffix*=nums[j];

        }
        
   return ans; }
}
class ProductExceptSelf {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = sol.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
/*Step 1: Store Prefix Products in Answer Array

For:

[1,2,3,4]

Build:

answer = [1,1,2,6]

Notice:

answer[i]
=
product of everything before i
Step 2: Traverse From Right

Maintain:

suffix = 1;

Now:

i = 3
answer[3] *= suffix;

becomes:

6 × 1 = 6

Update:

suffix *= nums[3];
suffix = 4

Now:

i = 2
answer[2] *= suffix;
2 × 4 = 8

Update:

suffix = 12

Now:

i = 1
1 × 12 = 12

Update:

suffix = 24

Now:

i = 0
1 × 24 = 24

Done.

Result:

[24,12,8,6]
Optimal Code
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] answer = new int[n];

        answer[0] = 1;

        for(int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        for(int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}
Complexity
Time  = O(n)
Space = O(1)

(LeetCode does not count the output array as extra space.)

Prefix-Suffix Intuition You Should Remember

When you see:

For every index i,
I need everything on the left
and everything on the right

think:

Prefix + Suffix

Examples:

Product Except Self
Trapping Rain Water
Equilibrium Index
Left Greater Right Smaller
Maximum Product Subarray (one approach)

This is one of the most important array patterns after HashMap and Sliding Window.

Next I would recommend Maximum Product Subarray, because that's where prefix/suffix thinking becomes much less obvious and much more interview-worthy.*/