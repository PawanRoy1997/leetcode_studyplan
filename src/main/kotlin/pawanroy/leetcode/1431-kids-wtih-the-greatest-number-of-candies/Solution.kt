package pawanroy.leetcode.`1431-kids-wtih-the-greatest-number-of-candies`

class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = 0
        for (candie in candies) if (candie > max) max = candie

        return List(candies.size) { max <= candies[it] + extraCandies }
    }
}