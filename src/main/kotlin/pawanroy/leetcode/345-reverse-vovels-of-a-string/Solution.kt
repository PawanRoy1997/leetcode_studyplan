package pawanroy.leetcode.`345-reverse-vovels-of-a-string`

import java.util.*

class Solution {
    private val VOVELS = listOf("a", "e", "i", "o", "u")
    fun reverseVowels(s: String): String {
        val vovels = Stack<String>()
        s.forEach {  c ->
            if(c.lowercase() in VOVELS){
                vovels.add(c.toString())
            }
        }
        val sb = StringBuilder()
        s.forEach { c ->
            if(c.lowercase() in VOVELS){
                sb.append(vovels.pop())
            }
            else sb.append(c)
        }
        return sb.toString()
    }
}