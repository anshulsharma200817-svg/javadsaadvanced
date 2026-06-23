class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if(map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
class TwoSumPractice {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
/*nums = [2,7,11,15]
target = 9

Start:

map = {}

i = 0

nums[i] = 2
need = 7

Not found.

Store:

{2 : 0}

i = 1

nums[i] = 7
need = 2

Found!

Return:

[0,1]

Done.

Pattern Learned

This is bigger than Two Sum.

Whenever you see:

Find pair
Find complement
Find target sum
Find difference

Ask:

Can I convert this into:

"Have I seen the required value before?"

If yes:

HashMap / HashSet*/