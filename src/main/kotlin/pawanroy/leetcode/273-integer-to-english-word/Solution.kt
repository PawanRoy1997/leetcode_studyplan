package pawanroy.leetcode.`273-integer-to-english-word`

class Solution {
    private val ONES = arrayOf(
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
        "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    )
    private val TENS = arrayOf("", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")

    private val THOUSAND = 1000
    private val MILLION = 1000000
    private val BILLION = 1000000000
    fun numberToWords(num: Int): String {
        if (num == 0) return "Zero"
        val sb = StringBuilder()
        var n = num

        if (n >= BILLION) {
            val billion = thousand(n / BILLION)
            sb.append(billion)
            sb.append(" Billion")
            n = num % BILLION
        }

        if (n >= MILLION) {
            val million = thousand(n / MILLION)
            if (million.isNotEmpty()) {
                sb.append(" ")
                sb.append(million)
                sb.append(" Million")
            }
            n = num % MILLION
        }

        if (n >= THOUSAND) {
            val thousand = thousand(n / THOUSAND)
            if (thousand.isNotEmpty()) {
                sb.append(" ")
                sb.append(thousand)
                sb.append(" Thousand")
            }
            n = num % THOUSAND
        }

        val ones = thousand(n)
        if (ones.isNotEmpty()) {
            sb.append(ones)
        }

        return sb.toString().trim().replace("  ", " ")
    }

    private fun thousand(number: Int): String {
        var num = number
        val hundred:String = if (num < 100) "" else {
            num = number % 100
            val h = number / 100
            "${thousand(h)} Hundred"
        }

        val tens = if (num < 20) ONES[num]
        else {
            val t = TENS[num/10]
            val o = ONES[num % 10]
            "$t $o"
        }

        return "$hundred $tens"
    }
}