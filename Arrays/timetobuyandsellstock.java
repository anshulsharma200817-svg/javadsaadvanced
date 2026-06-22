class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        /* key point in question was once he buy the stock he has only further days to sell for ma profit he cannot go back as it also applies in real world though */
        for(int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
class timetobuyandsellstock {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices));
    }
}
/*General Rule

When you see:

1. Maximize Difference

Examples:

max(arr[j] - arr[i])
j > i

Think:

Keep minimum seen so far.

Because:

current - minimum

gives largest gain.

2. Minimize Difference

Example:

min(arr[j] - arr[i])

Think:

Keep maximum/minimum candidates

depending on expression.

3. Looking for Largest Value

Example:

maximum element
maximum profit
maximum score
maximum sum

Usually maintain:

ans = Math.max(ans, candidate);
4. Looking for Smallest Value

Example:

minimum cost
minimum path
minimum distance

Usually maintain:

ans = Math.min(ans, candidate);
A Better Mental Model

Whenever you see an array problem, ask:

What information from the past do I need?

Example:

Stock:

Need cheapest buy price.

Store:

minPrice

Kadane:

Need best subarray ending before me.

Store:

currentSum

Prefix Sum:

Need sum till previous index.

Store:

prefix

Move Zeroes:

Need next position to place non-zero.

Store:

writePointer
Interview Trick

Ask yourself:

If I stand at index i, what single piece of information from the left side would help me answer this question?

That information becomes your variable.

Examples:

Problem	Information Needed
Stock	Minimum so far
Largest Element	Maximum so far
Prefix Sum	Sum so far
Kadane	Best subarray ending here
Rain Water	Left max / right max
Move Zeroes	Next write position
Majority Element	Candidate + count
Let's Practice

Don't think of algorithms.

Just answer:

For:

Maximum element in array

What information do you need to carry while traversing?

For:

Maximum subarray sum

What information do you think might be useful to carry while traversing?

Try answering these intuitively, and then we'll build Kadane's Algorithm from scratch instead of memorizing it.*/