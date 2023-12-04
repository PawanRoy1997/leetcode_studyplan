package pawanroy.leetcode.`1662-check-if-two-string-arrays-are-equivalent`

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        val q: Queue<Char> = LinkedList()
        word1.forEach { word -> word.forEach { c -> q.add(c) } }
        word2.forEach { word -> word.forEach { c -> if (q.peek() == c) q.poll() else return false } }
        return q.isEmpty()
    }
}