

/*Step 1: Why XOR Fails

For Single Number I, we relied on:

x ^ x = 0

So

x ^ x ^ x

becomes

(x ^ x) ^ x

↓

0 ^ x

↓

x

Wait...

That means three copies don't disappear!

Example:

5 ^ 5 ^ 5

=

5

So XOR is really tracking parity.

Times seen	XOR Result
1	x
2	0
3	x
4	0

It only knows odd vs. even.

But our problem needs to distinguish

3 occurrences

from

1 occurrence

XOR cannot do that.

Step 2: Think Per Bit, Not Per Number

This is the mental shift that unlocks advanced bit manipulation.

Forget whole numbers.

Look at one bit position at a time.

Suppose the array is

2
2
2
3

Binary:

2 = 10
2 = 10
2 = 10
3 = 11

Let's count only the least significant bit.

2 -> 0
2 -> 0
2 -> 0
3 -> 1

Count:

1

Now the next bit.

2 -> 1
2 -> 1
2 -> 1
3 -> 1

Count:

4

Interesting...

We didn't XOR.

We just counted.

Step 3: Where Does Modulo 3 Come In?

Imagine a bit position.

Every duplicate contributes exactly three times.

Suppose a bit is 1 in a duplicated number.

1
1
1

Total contribution:

3

Now imagine five duplicated numbers have that bit set.

3
+
3
+
3
+
3
+
3

=

15

Notice something?

Every duplicate contributes a multiple of 3.

Now add the unique number.

If its bit is 0

Total:

15

If its bit is 1

Total:

16

Now compute modulo 3.

15 % 3 = 0
16 % 3 = 1

Whoa.

The duplicates vanish.

Only the unique bit remains.

Let's Try Another Example

Array:

5
5
5
6

Binary:

5 = 101
5 = 101
5 = 101
6 = 110

Let's count each column.

Bit 0
1
1
1
0

Count:

3

Modulo 3:

0

So the answer's last bit is

0
Bit 1
0
0
0
1

Count:

1

Modulo 3:

1
Bit 2
1
1
1
1

Count:

4

Modulo 3

1

So the reconstructed bits are

110

which is

6

Exactly the unique number.

The Big Insight

Notice what we did.

We never tried to identify the unique number.

Instead, we reconstructed it one bit at a time.

That's a powerful pattern in bit manipulation:

If operating on whole numbers is hard, operate on each bit independently.

Since an int has only 32 bits, processing all bit positions is still constant work.

The Algorithm Is Starting to Appear

You're probably already seeing it.

For each bit position from 0 to 31:

Count how many numbers have that bit set.
Compute count % 3.
If the remainder is 1, set that bit in the answer.

That gives an algorithm with:

Time: O(32 × n) = O(n) (because 32 is a constant for Java ints)
Space: O(1)
Before we write any code, I have one question for you.

Suppose we're examining bit position 4.

How would you check whether that bit is set in a number?

Try to express it using only bit operations.

This is the last missing piece before we implement the solution.*/