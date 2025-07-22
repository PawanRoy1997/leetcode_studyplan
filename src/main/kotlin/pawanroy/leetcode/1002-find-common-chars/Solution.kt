package pawanroy.leetcode.`1002-find-common-chars`

class Solution {
    fun commonChars(words: Array<String>): List<String> {
        var result = words.first()

        words.forEach{ word ->
            result = commonString(result, word)
        }

        return result.split("").filter { it.isNotEmpty() }.toList()
    }

    private fun commonString(str1: String, str2: String): String{
        val isUsed = BooleanArray(str2.length){false}
        val result = StringBuilder()
        var ind: Int
        str1.forEach{ character ->
            ind = 0
            while(ind in str2.indices){
                if(str2[ind] == character && !isUsed[ind]){
                    isUsed[ind] = true
                    result.append(character)
                    break
                }
                ind++
            }
        }
        return result.toString()
    }
}