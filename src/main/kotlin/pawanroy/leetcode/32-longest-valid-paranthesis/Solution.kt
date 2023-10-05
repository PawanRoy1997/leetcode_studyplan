package pawanroy.leetcode.`32-longest-valid-paranthesis`

import java.util.*

class Solution {
    fun longestValidParentheses(s: String): Int {
        var result = 0
        val stack = Stack<Int>()
        stack.push(-1)
        s.forEachIndexed { index, char ->
            if (char == '(') stack.push(index)
            else {
                stack.pop()
                if(stack.isEmpty()){
                    stack.push(index)
                }else{
                    result = maxOf(result, index - stack.peek())
                }
            }
        }
        return result
    }
}