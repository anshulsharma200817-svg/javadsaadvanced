import java.util.Stack;
public class stack1 {
    public static void main(String[] args) {
     Stack<Integer> st=new Stack<>();
     st.push(40);
     st.push(30);
     st.push(20);
     st.push(10);
      
SYstem.out.println(st);
     
    }
}
/*The Real Definition

A stack answers this question:

"What is the most recent unresolved thing I've seen?"

That sentence alone solves 90% of stack problems.

Example 1 — Parentheses
( ( ) )

Read left to right.

See

(

Push.

Need to remember it.

See another

(

Push.

See

)

Who should match it?

The most recent unmatched "(".

Not the oldest one.

So we pop.

Notice something.

The stack stores

unresolved opening brackets.

Not all brackets.

Example 2 — Undo Button

Google Docs.

You type

A

B

C

Undo.

What disappears?

C.

Undo.

B.

Undo.

A.

Why?

Most recent action.

LIFO.

Example 3 — Browser
Google

↓

YouTube

↓

GitHub

↓

ChatGPT

Press Back.

Where do you go?

GitHub.

Again?

YouTube.

Again?

Google.

Again?

Nothing.

Exactly a stack.

Google-Level Thinking

The question is never

"Should I use a stack?"

Instead ask

"Do I need to repeatedly access the most recent unresolved element?"

If yes,

think Stack.

The Four Major Stack Patterns

This is what interviewers actually test.

Pattern 1 — Matching

Need to match things.

Examples

Valid Parentheses
Remove Outermost Parentheses
Minimum Remove to Make Valid Parentheses

Question

Which opening bracket hasn't been matched yet?

Pattern 2 — Monotonic Stack ⭐⭐⭐⭐⭐

This is the most important one.

Question

Find the next greater/smaller element.

Examples

Next Greater Element I
Daily Temperatures
Stock Span
Largest Rectangle in Histogram
Trapping Rain Water (stack solution)

This pattern appears constantly in interviews.

Pattern 3 — Expression Evaluation

Examples

2+3*5

(a+b)*c

Reverse Polish Notation

The stack remembers operands and operators until they can be evaluated.

Pattern 4 — DFS / Backtracking

Recursion itself uses a stack.

Every recursive call gets pushed.

When it returns,

it pops.

That's why recursion and stacks are deeply connected.

The Monotonic Stack

This is where the fun begins.

Imagine

2 1 4 3 5

Question:

For every number,

find the next greater element.

For

2

Answer

4

For

1

Answer

4

For

4

Answer

5

For

5

No answer.

How do you do this in O(n)?

Stack.

The Core Insight

The stack stores

elements whose answer hasn't been found yet.

Read that again.

That's the exact same idea we saw with parentheses.

Parentheses → unmatched brackets.
Next Greater Element → elements waiting for a greater value.
Daily Temperatures → days waiting for a warmer day.

Different problems.

Same pattern.

Stack Mental Model

When you scan an array:

1 3 2 5 4

At each element, ask:

"Can I finally resolve someone waiting on the stack?"

If yes,

pop them,

fill their answer,

continue.

If not,

push the current element.

How to Recognize Stack Problems

Whenever you see phrases like:

Next greater
Next smaller
Previous greater
Previous smaller
Nearest greater
Nearest smaller
Closest larger
Span
Matching symbols
Undo
History
Backtracking

Your brain should immediately think:

"Can a stack keep track of unresolved elements?"

The Roadmap

We'll learn stacks in this order:

Level 1 — Fundamentals
✅ Valid Parentheses
Min Stack
Level 2 — Monotonic Stack
⭐ Next Greater Element I
⭐ Daily Temperatures
⭐ Stock Span
⭐ Next Greater Element II
Level 3 — Advanced Monotonic Stack
Largest Rectangle in Histogram
Maximal Rectangle
Trapping Rain Water (Stack version)
Level 4 — Expression Problems
Evaluate Reverse Polish Notation
Basic Calculator
Decode String
Level 5 — Design Problems
Min Stack
Max Stack
Browser History
Implement Stack Using Queues
Here's how I want us to learn stacks

Exactly the way we've learned DP.

I won't say:

"Use a stack."

Instead, I'll ask:

"What information remains unresolved as we scan from left to right?"

If you can answer that, you'll naturally discover when a stack is the right tool.

And once you master monotonic stacks, you'll be solving the category of stack problems that companies like Google, Amazon, and Microsoft ask most frequently. That's where the real interview value lies.*/