package pawanroy.leetcode.`2530-maximal-score-after-applying-k-operations`

import java.util.PriorityQueue

class Solution {
    fun maxKelements(nums: IntArray, k: Int): Long {
        val comparator = object:Comparator<Int>{
            override fun compare(a:Int, b:Int):Int{
                return b-a
            }
        }

        val q = PriorityQueue<Int>(comparator)
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