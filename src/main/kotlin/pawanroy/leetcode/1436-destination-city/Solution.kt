package pawanroy.leetcode.`1436-destination-city`

class Solution {
    fun destCity(paths: List<List<String>>): String {
        val map: MutableMap<String, String> = HashMap()
        paths.forEach { map[it.source()] = it.destination() }
        var cursor: String = paths.first().source()
        while (map[cursor] != null) cursor = map[cursor].orEmpty()
        return cursor
    }

    fun List<String>.destination() = this[1]
    fun List<String>.source() = this.first()
}