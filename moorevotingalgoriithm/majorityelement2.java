class Solution {

    public List<Integer> majorityElement(int[] nums) {

        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {

            if (candidate1 == num) {
                count1++;
            }
            else if (candidate2 == num) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
        }

        List<Integer> ans = new ArrayList<>();

        if (count1 > nums.length / 3)
            ans.add(candidate1);

        if (count2 > nums.length / 3)
            ans.add(candidate2);

        return ans;
    }
}
class majorityelement2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 2, 3};
        System.out.println(s.majorityElement(nums)); // Output: [3]
    }
}
/*Dry Run

Input:

[1,2,3,1,2,1,1]

Initially

candidate1 = 0
candidate2 = 0

count1 = 0
count2 = 0
num = 1
count1 == 0

Choose

candidate1 = 1

count1 = 1
num = 2
count2 == 0

Choose

candidate2 = 2

count2 = 1
num = 3

Different from both.

count1--
count2--

Now

count1 = 0
count2 = 0

All three effectively cancel each other.

num = 1
count1 == 0

Again

candidate1 = 1

count1 = 1

Continue...

After first pass you'll get

candidate1 = 1
candidate2 = 2

Then second pass

1 -> 4

2 -> 2

Need

>7/3

>2

Answer

[1]
Pattern to Remember
Majority > n/2
1 candidate
1 count
Majority > n/3
2 candidates
2 counts
Majority > n/k
k-1 candidates
k-1 counts
Interview Questions (Very Common)
Why do we need 2 candidates?
Why is a second pass necessary?
Can this be generalized for n/k?
Why do we use else if and not separate if statements?
Why do we decrement both counts when a third distinct element appears?

If you can answer these five questions, you've truly mastered Moore's Voting Algorithm.*/