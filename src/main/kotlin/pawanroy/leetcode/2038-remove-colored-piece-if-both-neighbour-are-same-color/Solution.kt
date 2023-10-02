package pawanroy.leetcode.`2038-remove-colored-piece-if-both-neighbour-are-same-color`

class Solution {
    fun winnerOfGame(colors: String): Boolean {
        if (colors.length < 3) return false
        var alice = 0
        var bob = 0
        for (colorIndex in 1 until colors.lastIndex) {

            if (colors[colorIndex] == colors[colorIndex - 1] && colors[colorIndex] == colors[colorIndex + 1]) {
                if (colors[colorIndex] == 'A') alice += 1 else bob += 1
            }
        }

        return alice > bob
    }
}