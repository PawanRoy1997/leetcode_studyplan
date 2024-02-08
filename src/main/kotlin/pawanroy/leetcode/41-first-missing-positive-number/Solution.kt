package pawanroy.leetcode.`41-first-missing-positive-number`

class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        val q = sortedSetOf<Int>()

        nums.forEach(q::add)
        var i = 1
        q.forEach {
            if (it > i) {
                return i
            } else if (it == i) {
                i++
            }
        }
        return i
    }
}