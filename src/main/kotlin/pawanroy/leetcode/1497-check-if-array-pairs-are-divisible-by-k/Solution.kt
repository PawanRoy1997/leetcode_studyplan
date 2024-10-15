package pawanroy.leetcode.`1497-check-if-array-pairs-are-divisible-by-k`

class Solution {
    fun canArrange(arr: IntArray, k: Int): Boolean {
        val remainders = Array(100000) { 0 }

        arr.forEach {
            val rem = it % k

            if (rem == 0) {
                remainders[rem] = if (remainders[rem] == 0) 1 else 0
            } else if (rem < 0) {
                if (remainders[k + rem] < 0) {
                    remainders[k + rem]++
                } else {
                    remainders[-rem]--
                }
            } else {
                if (remainders[k - rem] > 0) {
                    remainders[k - rem]--
                } else {
                    remainders[rem]++
                }
            }
        }

        return !remainders.any { it != 0 }
    }
}