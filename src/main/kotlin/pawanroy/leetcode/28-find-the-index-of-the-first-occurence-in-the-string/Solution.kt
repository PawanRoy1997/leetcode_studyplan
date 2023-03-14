package pawanroy.leetcode.`28-find-the-index-of-the-first-occurence-in-the-string`

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if(haystack.length < needle.length) return -1
        for (i in 0..haystack.length - needle.length) {
            if (haystack[i] == needle.first() && haystack.subSequence(i, i + needle.length) == needle)
                return i
        }
        return -1
    }
}