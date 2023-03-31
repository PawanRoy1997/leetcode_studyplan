package pawanroy.leetcode.`844-backspace-string-compare`

import java.util.*

class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        val stack1 = Stack<Char>()
        val stack2 = Stack<Char>()
        putStringToStack(s, stack1)
        putStringToStack(t, stack2)

        if (stack1.size != stack2.size) return false

        val size = stack1.size
        for (i in 0 until size) if (stack1.pop() != stack2.pop()) return false

        return true
    }

    private fun putStringToStack(s: String, st: Stack<Char>) {
        for (c in s) if (c == '#') {
            if (st.isNotEmpty()) st.pop()
        } else st.push(c)
    }
}