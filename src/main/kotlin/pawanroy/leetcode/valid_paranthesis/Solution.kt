package pawanroy.leetcode.valid_paranthesis

import java.util.*

class Solution {
    private var small = 0
    private var medium = 0
    private var large = 0

    private var stack = Stack<Char>()

    fun isValid(s: String): Boolean {
        if (s.isEmpty()) return small == 0 && medium == 0 && large == 0
        when (s.first()) {
            '(' -> {
                small++
                stack.push(s.first())
            }

            '[' -> {
                medium++
                stack.push(s.first())
            }

            '{' -> {
                large++
                stack.push(s.first())
            }

            ')' -> {
                if(stack.isEmpty()) return false
                val lastElement = stack.pop()
                if (lastElement == '(') small--
            }

            ']' -> {
                if(stack.isEmpty()) return false
                val lastElement = stack.pop()
                if (lastElement == '[') medium--
            }

            '}' -> {
                if(stack.isEmpty()) return false
                val lastElement = stack.pop()
                if (lastElement == '{') large--
            }
        }
        return isValid(s.substring(1))
    }
}