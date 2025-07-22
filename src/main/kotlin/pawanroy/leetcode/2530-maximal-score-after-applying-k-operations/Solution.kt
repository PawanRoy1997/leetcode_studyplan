package pawanroy.leetcode.`2530-maximal-score-after-applying-k-operations`

import java.util.PriorityQueue

class Solution {
    fun maxKelements(nums: IntArray, k: Int): Long {
        val comparator = Comparator<Int> { a, b -> b-a }

        val q = PriorityQueue(comparator)
        nums.forEach(q::add)

        var res = 0L

        repeat(k){
            val a = q.remove()
            res += a.toLong()
            q.add((a+2)/3)
        }

        return res
    }
}