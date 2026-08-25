package pawanroy.leetcode.`3718-smallest-missing-multiple`

class Solution {
    fun missingMultiple(list: IntArray, k: Int): Int {
        val multiples = IntArray(101) { 0 }
        list.forEach { multiples[it] = 1 }
        var res = k
        while(res < 101){
            if(multiples[res] != 1) break
            res += k
        }
        return res
    }
}