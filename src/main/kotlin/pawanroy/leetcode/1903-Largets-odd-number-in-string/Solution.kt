package pawanroy.leetcode.`1903-Largets-odd-number-in-string`

import java.util.*

class Solution {
    fun largestOddNumber(num: String): String {
        val sb = StringBuilder()
        val stack = Stack<Char>()
        num.forEach(stack::push)
        while(stack.isNotEmpty() && (stack.peek() - '0') % 2 ==0) stack.pop()
        stack.forEach(sb::append)
        return sb.toString()
    }
}