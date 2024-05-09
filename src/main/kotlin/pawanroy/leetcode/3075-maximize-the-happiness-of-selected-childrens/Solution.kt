package pawanroy.leetcode.`3075-maximize-the-happiness-of-selected-childrens`

class Solution {
    fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
        happiness.sortDescending()

        var result = 0L

        for (i in 0 until k) {
            val a = happiness[i] - i
            if (a > 0) {
                result += a
            }
        }

        return result
    }
}