package pawanroy.leetcode.`2433-find-the-original-array-of-prefix-xor`

class Solution {
    fun findArray(pref: IntArray): IntArray {
        val result = IntArray(pref.size)

        for(i in pref.indices){
            if(i == 0) result[i] = pref[i]
            else{
                result[i] = pref[i].xor(pref[i-1])
            }
        }

        return result
    }
}