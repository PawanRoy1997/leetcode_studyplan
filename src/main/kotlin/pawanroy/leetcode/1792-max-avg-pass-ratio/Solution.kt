package pawanroy.leetcode.`1792-max-avg-pass-ratio`

import java.util.PriorityQueue

class Solution {
    data class Class(var pass: Int, var total: Int) {
        val ratio: Double
            get() = pass.toDouble() / total.toDouble()

        fun gain(): Double {
            return (pass + 1).toDouble() / (total + 1) - ratio
        }
    }

    fun maxAverageRatio(classes: Array<IntArray>, extraStudents: Int): Double {
        val pq = PriorityQueue<Class> { a, b ->
            b.gain().compareTo(a.gain()) // max heap by gain
        }

        for (c in classes) {
            pq.offer(Class(c[0], c[1]))
        }

        repeat(extraStudents) {
            val best = pq.poll()
            best.pass++
            best.total++
            pq.offer(best)
        }

        var sum = 0.0
        while (pq.isNotEmpty()) {
            sum += pq.poll().ratio
        }

        return sum / classes.size
    }
}
