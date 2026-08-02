// dp basically means do not solve the same subproblem again and again  idea is compute once store answer reuse later
/*When should DP come to your mind?

Two conditions:

1. Overlapping Subproblems

Same thing computed repeatedly.

Example:

f(3)

appears many times.

2. Optimal Substructure

Big answer can be built from smaller answers.

Example:

f(5)=f(4)+f(3)*/
public class fibodptabulation {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(fib(n, dp));
    }

    public static int fib(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}