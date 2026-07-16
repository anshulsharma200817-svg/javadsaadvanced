/*Now comes the DP observation

You said:

"What are we using again and again is previous sum at each index not adjacently."

👏 YES!

Let's make it clearer.

Suppose you're standing at house 4.

Question:

To know the best answer till house 4, what information do I need?

There are only two possibilities.

Option 1

Rob house 4.

If you rob it,

can you rob house 3?

❌ No.

So your money becomes

money at house 4

+

best till house 2

Notice

Not house 3.

House 2.

Option 2

Don't rob house 4.

Then your answer is simply

best till house 3

Therefore

Best till house 4

=

max(

Rob house 4 + Best till house 2,

Best till house 3

)

Boom.

That's the recurrence.

General Formula

Define

dp[i]

=

Maximum money you can rob up to house i.

Now

Two options.

Rob
nums[i]

+

dp[i-2]
Skip
dp[i-1]

Take maximum.

dp[i]

=

max(

nums[i]+dp[i-2],

dp[i-1]

)

This is the entire DP.

Why is DP needed?

Let's draw recursion.

rob(4)
       /       \
    Rob       Skip
     |           |
 rob(2)      rob(3)
    |        /     \
         rob(1)   rob(2)

Notice

rob(2)

appears twice.

Tomorrow it will appear ten times.

These are overlapping subproblems.

Instead of recalculating

store

dp[2]

Once.

That's DP.

The Beautiful Intuition

Don't think

"I'm robbing houses."

Think

"At every house, I have exactly two decisions."

          House i

        /          \

     Rob          Skip


DP simply remembers:

"I've already solved the best answer up to house i-2 and i-1, so I don't need to solve them again."

This is why House Robber is one of the best DP problems.

It teaches you that DP is about decisions.

At every state:

Take
Don't Take

Then ask:

Which choice gives the better result?

🔥 One question for you

Suppose the houses are:

[2,1,1,2]

Without writing code, tell me what each dp[i] should be.

Start with:

dp[0] = ?
dp[1] = ?
dp[2] = ?
dp[3] = ?

Don't think about the final answer. Just tell me what dp[i] means and fill the table step by step. This exercise is what makes the recurrence stick.
*/
public class houserobber {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 2};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];
    }
}