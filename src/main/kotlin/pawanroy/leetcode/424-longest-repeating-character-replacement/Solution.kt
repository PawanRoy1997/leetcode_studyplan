package pawanroy.leetcode.`424-longest-repeating-character-replacement`

class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val cCount = IntArray(26) { 0 }
        var mostFrequent = 0
        var left = 0
        var max = 0

        for (right in s.indices) {
            cCount[s[right] - 'A']++
            mostFrequent = maxOf(mostFrequent, cCount[s[right] - 'A'])

            val toChange = (right - left + 1) - mostFrequent
            if (toChange > k) {
                cCount[s[left] - 'A']--
                left++
            }

            max = maxOf(max, right - left + 1)
        }
        return max
    }
}