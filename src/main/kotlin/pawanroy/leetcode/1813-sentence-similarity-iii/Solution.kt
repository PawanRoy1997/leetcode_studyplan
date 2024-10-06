package pawanroy.leetcode.`1813-sentence-similarity-iii`

class Solution {
    fun areSentencesSimilar(sentence1: String, sentence2: String): Boolean {
        val smaller = ArrayList<String>()
        val larger = ArrayList<String>()

        if (sentence1.length < sentence2.length) {
            sentence1.split(" ").forEach { smaller.add(it) }
            sentence2.split(" ").forEach { larger.add(it) }
        } else {
            sentence2.split(" ").forEach { smaller.add(it) }
            sentence1.split(" ").forEach { larger.add(it) }
        }

        var start = true
        var end = true

        while (smaller.isNotEmpty()) {
            if (start) {
                if (smaller.first().equals(larger.first(), false)) {
                    smaller.removeFirst()
                    larger.removeFirst()
                }else{
                    start = false
                }
            }
            if(!start){
                if(smaller.last().equals(larger.last(), false)){
                    smaller.removeLast()
                    larger.removeLast()
                }else{
                    end = false
                    break
                }
            }
        }

        return start || end
    }
}