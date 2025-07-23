package pawanroy.leetcode.`1717-maximum-scrore-from-removing-substring`

class Solution {
    fun maximumGain(s: String, x: Int, y: Int): Int {
        var score = 0
        var str = s

        // First, remove higher value pairs greedily
        if (x > y) {
            score += removePattern(str, 'a', 'b', x).also { str = it.second }.first
            score += removePattern(str, 'b', 'a', y).first
        } else {
            score += removePattern(str, 'b', 'a', y).also { str = it.second }.first
            score += removePattern(str, 'a', 'b', x).first
        }

        return score
    }

    private fun removePattern(s: String, first: Char, second: Char, value: Int): Pair<Int, String> {
        val stack = ArrayDeque<Char>()
        var points = 0

        for (c in s) {
            if (stack.isNotEmpty() && stack.last() == first && c == second) {
                stack.removeLast()
                points += value
            } else {
                stack.addLast(c)
            }
        }

        return Pair(points, stack.joinToString(""))
    }
}
