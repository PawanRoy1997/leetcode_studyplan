package pawanroy.leetcode.`211-design-add-and-search-words-data-structure`

@Suppress("kotlin:S3776")
class WordDictionary {
    private val wordList = ArrayList<String>()
    private val isMatching = BooleanArray(25).apply {
        this[0] = true
    }

    fun addWord(word: String) {
        if(word.isEmpty()) return
        wordList.add(word)
    }

    fun search(word: String): Boolean {
        if (wordList.isEmpty()) return false
        if(word.isEmpty()) return true
        wordList.forEach {
            isMatching[word.length] = false
            if(it.length == word.length){
                for(i in 1 .. it.length){
                    isMatching[i] = (it[i-1]  == word[i-1] || word[i-1] == '.') && isMatching[i-1]

                    if(!isMatching[i]) break
                }

                if(isMatching[word.length]) return true
            }
        }
        return false
    }
}
