package pawanroy.leetcode.`946-validate-stack-sequences`

import java.util.*

class Solution {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        var ptrI = 0
        var ptrO = 0
        val size = pushed.size
        val stack = Stack<Int>()
        while (ptrO < size) {

            if (stack.isNotEmpty() && popped[ptrO] == stack.peek()) {
                print(stack.pop())
                ptrO++
                continue
            }

            if (ptrI < size) {
                if (pushed[ptrI] == popped[ptrO]) {
                    ptrI++
                    ptrO++
                } else {
                    stack.push(pushed[ptrI])
                    ptrI++
                }
                continue
            }

            return false
        }
        return true
    }
}