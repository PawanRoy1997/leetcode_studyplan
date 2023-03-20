package pawanroy.leetcode.`605-can-place-flowers`

class Solution {

    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var gap = 1
        var canBePlaced = 0
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 0) gap++
            else {
                if (gap % 2 == 0) gap--
                canBePlaced += gap / 2
                gap = 0
            }
        }

        canBePlaced += gap / 2

        return n <= canBePlaced
    }
}