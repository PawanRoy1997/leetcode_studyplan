package pawanroy.leetcode.`6-zigzag-conversion`

import java.util.*

class Solution {
    fun convert(s: String, numRows: Int): String {
        if(s.isEmpty() || numRows == 1) return s
        val diag = if (0 > (numRows - 2)) 0 else numRows - 2
        val diff = numRows+diag

        val lastIndex = s.length + numRows
        val sb = StringBuilder()
        val isSeen = Array(lastIndex + 1) { false }
        val queue: Queue<Int> = LinkedList()

        fun add(i: Int) {
            queue.offer(i)
            isSeen[i] = true
            if (i < s.length) sb.append(s[i])
        }

        var i = 0
        while (i*diff < lastIndex) {
            val i1 = i * diff
            if (i1 > lastIndex) break
            add(i1)
            i++
        }
        while (queue.isNotEmpty()) {
            i = queue.poll()
            if (i - 1 > 0 && !isSeen[i - 1]) add(i - 1)
            if (i + 1 < lastIndex && !isSeen[i + 1]) add(i + 1)
        }

        return sb.toString()
    }
}