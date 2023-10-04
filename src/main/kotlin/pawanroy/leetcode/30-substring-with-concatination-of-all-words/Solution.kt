package pawanroy.leetcode.`30-substring-with-concatination-of-all-words`


class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val length = words.first().length
        val wordsLength = length * words.size
        val wordMap = HashMap<String, Int>()
        if (s.isEmpty() || words.isEmpty() || s.length < wordsLength) return emptyList()

        words.forEach { word -> wordMap[word] = wordMap.getOrDefault(word, 0) + 1 }

        val slack = s.length - (wordsLength - 1)
        val results = ArrayList<Int>()
        for (i in 0 until slack) {
            if (containsAllWords(s.substring(i, i + wordsLength), wordMap, length)) results.add(i)
        }
        return results
    }

    private fun containsAllWords(s: String, words: HashMap<String, Int>, length: Int): Boolean {
        val stringMap = HashMap<String, Int>()
        for (i in s.indices step length) {
            val substring = s.substring(i, i + length)
            stringMap[substring] = stringMap.getOrDefault(substring, 0) + 1
        }

        return stringMap == words
    }
}