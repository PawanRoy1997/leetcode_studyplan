package pawanroy.leetcode.`451-sort-characters-by-frequency`

import java.util.*
import kotlin.collections.HashMap


class Solution {
    fun frequencySort(s: String): String {
        val map: MutableMap<Char, Int> = HashMap()

        s.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        val pq = PriorityQueue { a: Map.Entry<Char, Int>, b: Map.Entry<Char, Int> -> b.value - a.value }

        pq.addAll(map.entries)

        val result = StringBuilder()
        while (!pq.isEmpty()) {
            val entry = pq.poll()
            result.append(entry.key.toString().repeat(entry.value))
        }

        return result.toString()
    }
}

