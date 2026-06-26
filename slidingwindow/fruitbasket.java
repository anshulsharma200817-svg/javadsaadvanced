class Solution {
    public int totalFruit(int[] fruits) {
        // we can return max length of subarray which have only two different type of value
        // so we make a frequency map for each window if the size exceeds two we need to shrink left pointer 
        HashMap<Integer,Integer> map =new HashMap<>();
        int max=0;
        int l=0;
        for(int r=0;r<fruits.length;r++) {
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while (map.size() > 2) {

    map.put(fruits[l], map.get(fruits[l]) - 1);

    if (map.get(fruits[l]) == 0) {
        map.remove(fruits[l]);
    }

    l++;
}
            max=Math.max(max,r-l+1);
         
        }
   return max; }
}
class fruitbasket {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] fruits = {1, 2, 1};
        System.out.println(s.totalFruit(fruits)); // Output: 3
    }
}