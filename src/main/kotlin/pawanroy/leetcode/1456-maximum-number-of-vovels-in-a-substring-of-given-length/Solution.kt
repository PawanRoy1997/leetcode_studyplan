package pawanroy.leetcode.`1456-maximum-number-of-vovels-in-a-substring-of-given-length`

class Solution {
    fun maxVowels(s: String, k: Int): Int {
        var max = 0
        var current = 0
        for (i in s.indices) {
            if (i < k) {
                if (s[i].isVovel()) current += 1
            } else {
                max = maxOf(max, current)
                if (s[i].isVovel()) current += 1
                if (s[i - k].isVovel()) current -= 1
            }
        }
        return maxOf(max, current)
    }

    fun Char.isVovel(): Boolean {
        return this in arrayOf('a', 'e', 'i', 'o', 'u')
    }
}