package pawanroy.leetcode.`65-valid-number`

class Solution {
    fun isNumber(s: String): Boolean {
        var hasNum = false
        var hasE = false
        var hasDot = false

        s.forEachIndexed {i, c ->
            when (c) {
                in '0'..'9' -> hasNum = true
                'e', 'E' -> {
                    if (!hasNum || hasE) {
                        return false
                    }
                    hasE = true
                    hasNum = false
                }
                '+', '-' -> {
                    if (i > 0 && (s[i - 1] != 'E' && s[i - 1] != 'e')) {
                        return false
                    }
                }
                '.' -> {
                    if (hasE || hasDot) {
                        return false
                    }
                    hasDot = true
                }
                else -> return false
            }
        }

        return hasNum
    }
}