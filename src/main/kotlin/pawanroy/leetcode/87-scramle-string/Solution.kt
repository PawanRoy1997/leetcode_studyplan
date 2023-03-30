package pawanroy.leetcode.`87-scramle-string`


class Solution {
    // for storing already solved problems
    private var mp: MutableMap<String, Boolean> = HashMap()
    fun isScramble(s1: String, s2: String): Boolean {
        val n = s1.length

        // if both strings are equal
        if (s1 == s2) return true

        // if code is reached to this condition then following this are sure:
        // 1. size of both string is equal
        // 2. string are not equal
        // so size is equal (where size==1) and they are not equal then obviously false
        // example 'a' and 'b' size is equal ,string are not equal
        if (n == 1) return false
        val key = "$s1 $s2"

        // check if this problem has already been solved
        if (mp.containsKey(key)) return mp[key]!!

        // for every iteration it can two condition
        // 1.we should proceed without swapping
        // 2.we should swap before looking next
        for (i in 1 until n) {
            // ex of without swap: gr|eat and rg|eat
            val withoutSwap = (// left part of first and second string
                    isScramble(s1.substring(0, i), s2.substring(0, i))
                            &&  // right part of first and second string;
                            isScramble(s1.substring(i), s2.substring(i)))

            // if without swap give us right answer then we do not need
            // to call the recursion withswap
            if (withoutSwap) {
                mp[key] = true
                return true
            }

            // ex of withswap: gr|eat rge|at
            // here we compare "gr" with "at" and "eat" with "rge"
            val withSwap = (// left part of first and right part of second
                    isScramble(s1.substring(0, i), s2.substring(n - i))
                            &&  // right part of first and left part of second
                            isScramble(s1.substring(i), s2.substring(0, n - i)))

            // if withswap give us right answer then we return true
            // otherwise the for loop do it work
            if (withSwap) {
                mp[key] = true
                return true
            }
            // we are not returning false in else case
            // because we want to check further cases with the for loop
        }
        mp[key] = false
        return false
    }
}