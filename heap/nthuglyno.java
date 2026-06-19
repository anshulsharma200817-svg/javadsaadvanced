import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {

        // Min Heap -> always gives the smallest ugly number
        PriorityQueue<Long> pq = new PriorityQueue<>();

        // Used to avoid duplicates
        // Example:
        // 2*3 = 6
        // 3*2 = 6
        // Without HashSet, 6 would be inserted twice
        HashSet<Long> set = new HashSet<>();

        // First ugly number
        pq.add(1L);
        set.add(1L);

        long ugly = 1;

        /*
        DRY RUN FOR n = 10

        Initially:

        pq  = [1]
        set = {1}

        ------------------------------------------------

        Iteration 1

        ugly = 1

        Generate:
        1*2 = 2
        1*3 = 3
        1*5 = 5

        pq = [2,3,5]

        1st ugly number = 1

        ------------------------------------------------

        Iteration 2

        ugly = 2

        Generate:
        4,6,10

        pq = [3,4,5,6,10]

        2nd ugly number = 2

        ------------------------------------------------

        Iteration 3

        ugly = 3

        Generate:
        6,9,15

        6 already exists -> skip

        pq = [4,5,6,9,10,15]

        3rd ugly number = 3

        ------------------------------------------------

        Iteration 4

        ugly = 4

        Generate:
        8,12,20

        pq = [5,6,8,9,10,12,15,20]

        4th ugly number = 4

        ------------------------------------------------

        Iteration 5

        ugly = 5

        Generate:
        10,15,25

        10 and 15 already present

        pq = [6,8,9,10,12,15,20,25]

        5th ugly number = 5

        ------------------------------------------------

        Iteration 6

        ugly = 6

        Generate:
        12,18,30

        12 already exists

        pq = [8,9,10,12,15,18,20,25,30]

        6th ugly number = 6

        ------------------------------------------------

        Iteration 7

        ugly = 8

        Generate:
        16,24,40

        pq = [9,10,12,15,16,18,20,24,25,30,40]

        7th ugly number = 8

        ------------------------------------------------

        Iteration 8

        ugly = 9

        Generate:
        18,27,45

        18 already exists

        pq = [10,12,15,16,18,20,24,25,27,30,40,45]

        8th ugly number = 9

        ------------------------------------------------

        Iteration 9

        ugly = 10

        Generate:
        20,30,50

        20 and 30 already exist

        pq = [12,15,16,18,20,24,25,27,30,40,45,50]

        9th ugly number = 10

        ------------------------------------------------

        Iteration 10

        ugly = 12

        10th ugly number = 12

        Answer = 12
        */

        for(int i=0;i<n;i++) {

            // Smallest ugly number available
            ugly = pq.poll();

            // Generate next candidates
            long a = ugly * 2;
            long b = ugly * 3;
            long c = ugly * 5;

            // Insert only if not already generated

            if(!set.contains(a)) {
                pq.add(a);
                set.add(a);
            }

            if(!set.contains(b)) {
                pq.add(b);
                set.add(b);
            }

            if(!set.contains(c)) {
                pq.add(c);
                set.add(c);
            }
        }

        // After nth poll,
        // ugly stores the nth ugly number
        return (int) ugly;
    }
}
class nthuglyno {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int result = sol.nthUglyNumber(n);
        System.out.println("The " + n + "th ugly number is: " + result);
    }
}