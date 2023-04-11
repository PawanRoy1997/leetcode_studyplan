package pawanroy.leetcode.`692-top-k-requent-words`

import java.util.*

class Solution {

    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val wordFreq = HashMap<String, Int>()
        for (word in words) wordFreq[word] = (wordFreq[word] ?: 0) + 1

        val pq = PriorityQueue<Pair<String, Int>> { str1, str2 ->
            if (str1.second != str2.second) str2.second - str1.second
            else str1.first.compareTo(str2.first)
        }

        wordFreq.forEach { entry -> pq.add(Pair(entry.key, entry.value)) }

        return List(k) { pq.poll().first }
    }
}