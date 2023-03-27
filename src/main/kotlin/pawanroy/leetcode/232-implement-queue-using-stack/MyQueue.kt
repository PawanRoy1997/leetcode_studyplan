package pawanroy.leetcode.`232-implement-queue-using-stack`

import java.util.*

class MyQueue() {
    private val loader = Stack<Int>()
    private val unLoader = Stack<Int>()
    fun push(x: Int) {
        loader.push(x)
    }

    fun pop(): Int {
        if (unLoader.isEmpty()) while (loader.isNotEmpty()) unLoader.push(loader.pop())
        return unLoader.pop()
    }

    fun peek(): Int {
        if (unLoader.isEmpty()) while (loader.isNotEmpty()) unLoader.push(loader.pop())
        return unLoader.peek()
    }

    fun empty(): Boolean {
        return loader.empty() && unLoader.empty()
    }
}