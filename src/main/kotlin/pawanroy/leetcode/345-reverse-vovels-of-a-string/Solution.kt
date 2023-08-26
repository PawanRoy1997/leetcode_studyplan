package pawanroy.leetcode.`345-reverse-vovels-of-a-string`

class Solution {
    private val VOVELS = listOf("a", "e", "i", "o", "u")
    fun reverseVowels(s: String): String {
        val vovels = ArrayList<String>()
        var count = -1
        s.forEach {  c ->
            if(c.lowercase() in VOVELS){
                vovels.add(c.toString())
                count++
            }
        }
        val sb = StringBuilder()
        s.forEach { c ->
            if(c.toString() in VOVELS){
                sb.append(vovels[count])
                count--
            }
            else sb.append(c)
        }
        return sb.toString()
    }
}