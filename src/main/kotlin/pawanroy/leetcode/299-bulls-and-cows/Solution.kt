package pawanroy.leetcode.`299-bulls-and-cows`

class Solution {
    fun getHint(secret: String, guess: String): String {
        val cCount = IntArray(10) { 0 }
        var a = 0
        var b = 0
        for (i in guess.indices) cCount[guess[i] - '0']++
        for (i in secret.indices) {
            if (guess[i] == secret[i]) {
                a++
                cCount[secret[i] - '0']--
            }
        }

        for (i in secret.indices) {
            if (guess[i] != secret[i] && cCount[secret[i] - '0'] > 0) {
                b++
                cCount[secret[i] - '0']--
            }
        }

        return "${a}A${b}B"
    }
}