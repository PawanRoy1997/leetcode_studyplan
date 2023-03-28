package pawanroy.leetcode.`983-minimum-cost-for-tickets`

class Solution {
    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        val cost = IntArray(366) { 0 }

        fun costAtIndex(i: Int) = if (i < 0) 0 else cost[i]

        for (i in 1..365) {

            if (!days.contains(i)) {
                cost[i] = cost[i - 1]
                continue
            }

            cost[i] = minOf(
                costAtIndex(i - 1) + costs[0],
                minOf(
                    costAtIndex(i - 7) + costs[1],
                    costAtIndex(i - 30) + costs[2]
                )
            )

        }

        return cost[365]
    }
}
