package pawanroy.leetcode.`1688-count-number-of-matches-in-tournament`

class Solution {
    fun numberOfMatches(n: Int): Int {
        if (n < 2) return 0
        var matches = 0
        var teams = n
        while (teams > 1) {
            if (teams % 2 == 0) {
                teams /= 2
                matches += teams
            } else {
                teams = (teams - 1) / 2
                matches += teams
                teams++
            }
        }
        return matches
    }
}