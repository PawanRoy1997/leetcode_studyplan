package pawanroy.leetcode.`65-valid-number`

class Solution {
    private val integerRegex = Regex("[-+]?\\d+")
    private val decimalRegex = Regex("[-+]?((\\d+\\.\\d*)|(\\.\\d+))")
    fun isNumber(s: String): Boolean {

        return s.matches(Regex("[-+]?((\\d+\\.?\\d*)|(\\.\\d+))(e[-+]?\\d+)?", RegexOption.IGNORE_CASE))
//        return if (s.lowercase().contains("e")) {
//            val parts = s.lowercase().split("e")
//            (parts.size <= 2) && (integerNumber(parts[0]) || isDecimalNumber(parts[0])) && integerNumber(parts[1])
//        } else integerNumber(s) || isDecimalNumber(s)
    }

    private fun integerNumber(s: String): Boolean {
        return s.matches(integerRegex)
    }

    private fun isDecimalNumber(s: String): Boolean {
        return s.matches(decimalRegex)
    }
}