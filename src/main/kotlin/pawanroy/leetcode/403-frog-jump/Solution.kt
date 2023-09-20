package pawanroy.leetcode.`403-frog-jump`

import java.util.*

class Solution {
    fun canCross(stones: IntArray): Boolean {
        val stack = Stack<Pair<Int, Int>>()
        val stonesToReach = ArrayList<Int>()

        stones.forEach(stonesToReach::add)

        stack.push(Pair(0, stones[0]))
        while (stack.isNotEmpty()) {
            val current = stack.pop()
            
            // passing condition
            if (current.second == stones[stones.lastIndex]) return true
            if (current.first > 0 && stones.contains(current.second + current.first))
                stack.push(Pair(current.first, current.second + current.first))
            if (current.first - 1 > 0 && stones.contains(current.second + current.first - 1))
                stack.push(Pair(current.first - 1, current.second + current.first - 1))
            if (stones.contains(current.second + current.first + 1))
                stack.push(Pair(current.first + 1, current.second + current.first + 1))
        }
        return false
    }
}