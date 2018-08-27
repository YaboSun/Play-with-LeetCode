/**
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not.
 * However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
 * and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 *
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 *
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 */
public class Solution6051 {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(new Solution6051().canPlaceFlowers(flowerbed, n));
    }

    // My solution and doesn't ac at last
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 1;
        int maxFlowerNum = 0;
        boolean canPlaceFlowers = false;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && count != 3) {
                count++;
            } else if (count == 3){
                maxFlowerNum++;
                count = 0;
                i= i - 2;
            } else if (flowerbed[i] == 1) {
                count = 0;
            }
        }
        if (n <= maxFlowerNum) {
            canPlaceFlowers = true;
        }
        return canPlaceFlowers;
    }
}
