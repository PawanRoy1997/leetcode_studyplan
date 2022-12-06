package pawanroy.leetcode.isomorphic_strings

class Solution {

    private val alphabets = arrayOf(
        "a", "b", "c", "d",
        "e", "f", "g", "h",
        "i", "j", "k", "l",
        "m", "n", "o", "p",
        "q", "r", "s", "t",
        "u", "v", "w", "x",
        "y", "z"
    )

    fun isIsomorphic(s: String, t: String): Boolean {
        val sMap = s.uniqueValueMap()
        val tMap = t.uniqueValueMap()
        return sMap.equals(tMap, true)
    }

    private fun String.uniqueValueMap(): String {
        var index = 0
        val map: MutableMap<Int, Int> = HashMap()
        this.chars().distinct().forEach {
            map[it] = index
            index++
        }
        val result = StringBuilder()
        this.chars().forEach {
            var ind = map[it]!!
            ind = if(ind > 25) ind % 25 else ind
            result.append(alphabets[ind])
        }
        return result.toString()
    }

}