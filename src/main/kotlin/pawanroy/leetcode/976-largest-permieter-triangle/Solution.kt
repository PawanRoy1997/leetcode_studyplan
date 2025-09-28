package pawanroy.leetcode.`976-largest-permieter-triangle`

import java.util.PriorityQueue

class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        val q = PriorityQueue<Int>(compareByDescending { it })
        nums.forEach { q.add(it) }
        var sideA = 0
        var sideB = 0
        var sideC = 0
        var max = 0
        while (q.isNotEmpty()) {
            sideA = q.poll()
            sideB = q.poll()
            sideC = q.poll()
            if (sideA < (sideB + sideC)) {
                if ((sideA + sideB + sideC) > max) {
                    max = (sideA + sideB + sideC)
                } else {
                    return max
                }
            }
            q.add(sideB)
            q.add(sideC)
        }

        return max
    }
}