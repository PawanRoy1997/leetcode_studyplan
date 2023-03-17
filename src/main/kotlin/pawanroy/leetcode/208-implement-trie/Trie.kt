package pawanroy.leetcode.`208-implement-trie`

class Trie {
    private var left: Trie? = null
    private var right: Trie? = null
    private var current = ""

    fun insert(word: String) {
        if (current.isEmpty()) {
            current = word
        } else {
            if (word[0] < current[0]) insertLeft(word)
            else insertRight(word)
        }
    }

    private fun insertLeft(word: String) {
        if (left == null) left = Trie()
        left!!.insert(word)
    }

    private fun insertRight(word: String) {
        if (right == null) right = Trie()
        right!!.insert(word)
    }

    fun search(word: String): Boolean {
        if(current.isEmpty()) return false

        val isCurrent = (current.length >= word.length) && current.equals(word, false)
        if (isCurrent) return true

        return if (word[0] < current[0] && left != null) left!!.search(word)
        else if (word[0] >= current[0] && right != null) right!!.search(word)
        else false
    }

    fun startsWith(prefix: String): Boolean {
        var isCurrent = current.length >= prefix.length
        if(isCurrent) for(i in prefix.indices){
            if(current[i] != prefix[i]){
                isCurrent = false
                break
            }
        }

        if (isCurrent) return true
        if(current.isEmpty()) return false

        return if (prefix[0] < current[0] && left != null) left!!.startsWith(prefix)
        else if (prefix[0] >= current[0] && right != null) right!!.startsWith(prefix)
        else false
    }
}