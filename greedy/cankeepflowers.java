class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0)
            return true;

        for (int i = 0; i < flowerbed.length; i++) {

            boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
            boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

            if (flowerbed[i] == 0 && leftEmpty && rightEmpty) {

                flowerbed[i] = 1;
                n--;

                if (n == 0)
                    return true;
            }
        }

        return false;
    }
}
class cankeepflowers {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        Solution solution = new Solution();
        boolean result = solution.canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }
}