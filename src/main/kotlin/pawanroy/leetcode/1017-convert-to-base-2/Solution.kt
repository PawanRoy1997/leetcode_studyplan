package pawanroy.leetcode.`1017-convert-to-base-2`

import java.util.*

class Solution {

    fun baseNeg2(n: Int): String {
        if (n == 0) return "0"
        val stack = Stack<Int>()
        var number = n
        val result = StringBuilder()
        while (number != 1) {
            if (number % 2 != 0) stack.push(1) else stack.push(0)
            if (number < 0 && number % 2 != 0) number--
            number /= (-2)
        }
        stack.push(1)
        while (!stack.isEmpty()) {
            result.append(stack.pop())
        }
        return result.toString()
    }
}