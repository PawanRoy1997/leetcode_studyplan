package pawanroy.leetcode.`1291-sequential-digits`


class Solution {
    fun sequentialDigits(low: Int, high: Int): List<Int> {
        val reference = "123456789"
        val result: MutableList<Int> = ArrayList()

        for (index in reference.indices) {
            for (j in index + 1..reference.length) {
                val curr = reference.substring(index, j).toInt()
                if (curr in low..high) {
                    result.add(curr)
                }
            }
        }

        result.sort()
        return result
    }
}

