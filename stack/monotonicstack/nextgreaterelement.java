class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Process nums2
        for (int num : nums2) {

            // Current element resolves all smaller unresolved elements
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        // Remaining elements have no greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
class nextgreaterelement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result)); // Output: [-1, 3, -1]
    }
}
/*Dry Run
nums2 = [2,1,4,3]

Initially

Stack = []
Map = {}
Read 2

Push

Stack = [2]
Read 1
1 > 2 ?

No.

Push.

Stack = [2,1]
Read 4
4 > 1

Yes.

1 → 4

Pop.

Stack = [2]
Map = {1=4}

Again

4 > 2

Yes.

2 → 4

Pop.

Stack = []
Map = {1=4,2=4}

Push 4

Stack = [4]
Read 3
3 > 4 ?

No.

Push.

Stack = [4,3]
End

Everything left has no next greater.

3 → -1
4 → -1

Final Map

{
1=4,
2=4,
3=-1,
4=-1
}

For

nums1=[2,3]

Answer becomes

2 → 4

3 → -1

Result

[4,-1]
Time Complexity
Building map : O(n)

Answer queries : O(m)

Overall : O(n + m)

where

n = nums2.length
m = nums1.length
Space Complexity
O(n)

for the stack and the HashMap.

📒 Engineering Journal Notes
Pattern Learned: Monotonic Stack

Question to ask:

"Which elements are still waiting for their answer?"

Those unresolved elements are stored in the stack.

Recognition Pattern

If the problem contains words like:

Next Greater
Next Smaller
Previous Greater
Previous Smaller
Nearest Greater
Daily Temperatures
Stock Span

→ Think Monotonic Stack.

General Template
Stack<T> stack = new Stack<>();

for (element : array) {

    while (!stack.isEmpty() && current resolves stack.peek()) {

        // Store answer for stack top
        stack.pop();
    }

    stack.push(current);
}

// Remaining elements have no answer
while (!stack.isEmpty()) {
    // Assign default value
    stack.pop();
}
One thing I want you to notice

This problem follows the same mindset we've been developing in DP:

In Trapping Rain Water, you precomputed helper information (leftMax, rightMax).
In Next Greater Element, you precompute a HashMap from each value to its next greater element.

In both cases, you're doing one preprocessing pass over the main data structure to build information that makes answering later queries trivial. That's a powerful algorithmic pattern that appears in many interview problems.*/