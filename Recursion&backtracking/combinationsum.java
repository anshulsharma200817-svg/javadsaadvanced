class Solution {
    int[] candidates;
    int target;
    List<List<Integer>> list = new ArrayList<>();

    public void backtrack(int ind, List<Integer> curr, int sum) {

        if(sum == target) {
            list.add(new ArrayList<>(curr));
            return;
        }

        if(sum > target) return;

        if(ind == candidates.length) return;

        // Take current element
        curr.add(candidates[ind]);
        backtrack(ind, curr, sum + candidates[ind]);

        // Undo choice
        curr.remove(curr.size() - 1);

        // Don't take current element
        backtrack(ind + 1, curr, sum);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;

        backtrack(0, new ArrayList<>(), 0);

        return list;
    }
} 
class combinationSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = sol.combinationSum(candidates, target);
        System.out.println(result);
    }
}