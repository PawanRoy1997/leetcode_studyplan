package pawanroy.leetcode.`2197-replace-non-coprimes-in-array`

import java.util.HashMap
import java.util.Stack

class Solution {
    private val gcmMap: MutableMap<String, Int> = HashMap()

    fun replaceNonCoprimes(nums: IntArray): List<Int> {
        val stack = Stack<Int>()

        for (num in nums) {
            stack.push(num)
            while (stack.size > 1) {
                val x = stack[stack.size - 2]
                val y = stack.peek()
                if (gcmOf(x, y) > 1) {
                    stack.pop()
                    stack.pop()
                    stack.push(x * (y / gcmOf(x, y)))
                } else {
                    break
                }
            }
        }

        return stack.toList()
    }

    private fun gcmOf(a: Int, b: Int): Int {
        if(gcmMap.contains("$a,$b")) return gcmMap["$a,$b"] ?: 1
        if(a == b) return a

        val smaller = minOf(a, b)
        val larger = maxOf(a, b)

        var gcm = 1
        var i = 2
        while (i * gcm <= smaller) {
            val d = i * gcm
            if ((smaller % d == 0) && (larger % d == 0)) {
                gcm = d
            } else i++
        }

        gcmMap["$smaller,$larger"] = gcm
        gcmMap["$larger,$smaller"] = gcm
        return gcm
    }
}