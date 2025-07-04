package pawanroy.leetcode.`3304-find-kth-character-in-string-game2`

class Solution {
    fun kthCharacter(k: Long, operations: IntArray): Char {
        if (k == 1L) return 'a'
        var operation = 0
        var a = k - 1
        var index = 0
        while (a > 0) {
            if ((a and 1) == 1L) {
                operation += operations[index]
                if (operation >= 26)
                    operation = operation % 26
            }
            a = a / 2
            index++
        }
        return ('a'.code + operation).toChar()
    }

}