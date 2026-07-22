class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        //imagine xoring everything as the xor follows commutative and associative property so in any order the same no xoring will cancel out and only 1 number will be the remaining
        int x=nums[0];
        for(int i=1;i<nums.length;i++) {
        x=x^nums[i];
        }

        
    return x;}
}
class singleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Solution solution = new Solution();
        int result = solution.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
/*et's first understand XOR as a mathematical operation.

Most people memorize this table:

A	B	A ^ B
0	0	0
0	1	1
1	0	1
1	1	0

That isn't enough.

The important question is:

What does XOR actually mean?

Think of XOR as answering:

"Are these two bits different?"

If yes → 1

If no → 0

Example
5 = 0101
3 = 0011

5 ^ 3

0101
0011
----
0110 = 6

Bit by bit:

0 vs 0 → same → 0

1 vs 0 → different → 1

0 vs 1 → different → 1

1 vs 1 → same → 0
Now Observe Something Amazing
5 ^ 5
0101
0101
----
0000

Result:

0

This is true for every number.

x ^ x = 0

This is the first law.

Another Observation
5 ^ 0
0101
0000
----
0101

Nothing changes.

So

x ^ 0 = x

Second law.

Third Property
2 ^ 5

equals

5 ^ 2

Order doesn't matter.

This is called commutativity.

Fourth Property
(2 ^ 5) ^ 7

=

2 ^ (5 ^ 7)

Grouping doesn't matter.

This is associativity.

These Four Laws Are Everything
x ^ x = 0

x ^ 0 = x

A ^ B = B ^ A

(A ^ B) ^ C = A ^ (B ^ C)

Memorize these—not because they're arbitrary, but because every XOR interview problem comes from them.

Now Let's Think About the Problem

Suppose I give you:

[4, 1, 2, 1, 2]

What do you notice?

Every number appears twice except one.

How would you solve it without bits?

Probably with a HashMap.

4 → 1
1 → 2
2 → 2

Answer:

4

Time:

O(n)

Space:

O(n)

Good.

Can we do O(1) space?

Imagine XORing Everything

Let's do it slowly.

4 ^ 1 ^ 2 ^ 1 ^ 2

Now use associativity.

Rearrange mentally.

4 ^ (1 ^ 1) ^ (2 ^ 2)

Now apply the first law.

4 ^ 0 ^ 0

Then the second law.

4

Done.

This Is the Entire Algorithm

Not because someone discovered a trick.

Because duplicates cancel each other out under XOR.

Imagine each duplicate pair annihilating itself:

1 ^ 1

↓

0
2 ^ 2

↓

0

Leaving only the lonely number.

Why Addition Doesn't Work

Suppose you try

4 + 1 + 2 + 1 + 2

You get

10

Nothing cancels.

Subtraction?

You don't know what to subtract.

HashMap?

Needs memory.

Only XOR has this cancellation property.

Think of XOR Like This

Imagine every duplicate is a person entering and leaving a room.

1 enters

↓

1 leaves

↓

Room empty

Another pair:

2 enters

↓

2 leaves

↓

Room empty

Only one person never leaves.

That's your answer.

The Code

Now the implementation almost writes itself.

class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }
}
Dry Run
nums

[4,1,2,1,2]

Start

ans = 0
ans ^= 4

0 ^ 4 = 4
ans ^= 1

4 ^ 1 = 5
ans ^= 2

5 ^ 2 = 7
ans ^= 1

7 ^ 1 = 6
ans ^= 2

6 ^ 2 = 4

Return

4

Notice that ans doesn't visibly "store the unique element" at each step. Instead, it stores the XOR of everything seen so far. As duplicate values arrive, they cancel themselves, and by the end only the single number remains.

The Big Intuition

Here's the mental model I want you to keep:

Addition accumulates values.

2 + 2 = 4

XOR accumulates parity (odd/even occurrences).

Seen a value once? It's "present" in the XOR.
Seen it twice? It cancels.
Seen it three times? It's present again.
Seen it four times? It cancels again.

So XOR doesn't count how many times something appears—it only tracks whether it has appeared an odd or even number of times.

That idea—odd vs. even occurrence parity—is the foundation for many advanced bit manipulation problems, including Missing Number, Single Number III, and even some graph and prefix XOR problems.

Your turn

Before moving to Missing Number (268), answer this without calculating on paper:

8 ^ 5 ^ 8 ^ 3 ^ 5

Use only the four XOR laws above. If you can simplify it in your head, you've developed the right XOR intuition.*/