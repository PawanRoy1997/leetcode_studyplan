package pawanroy.leetcode.valid_paranthesis

import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        var brackets = 0
        val stack = Stack<Char>()
        s.forEach {
            if (it == '(' || it == '[' || it == '{') {
                brackets++
                stack.push(it)
            } else if (stack.hasOpeningBracket(it)) {
                stack.pop(); brackets--
            } else return false

        }
        return brackets == 0
    }

    private fun Stack<Char>.hasOpeningBracket(input: Char): Boolean {
        return this.isNotEmpty() && ((input == ')' && this.peek() == '(')
                || (input == ']' && this.peek() == '[')
                || (input == '}' && this.peek() == '{'))
    }
}