package pawanroy.leetcode.`567-permutation-string`

class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        val count = Array(26) { 0 }

        s1.forEach { count[it - 'a']++ }

        for (i in s2.indices) {
            if (s1.contains(s2[i]) && (s1.lastIndex + i) < s2.length) {
                val copy = count.clone()
                for(j in s1.indices){
                    copy[s2[j+i]-'a']--
                }

                var sum = 0
                copy.forEach {
                    sum += maxOf(it, -it)
                }

                if(sum == 0) return true
            }
        }

        return false
    }
}