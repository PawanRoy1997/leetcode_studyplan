package pawanroy.leetcode.`879-profitable-scheme`

class Solution {

    fun profitableSchemes(n: Int, minProfit: Int, group: IntArray, profit: IntArray): Int {
        val N = group.size
        /* Indexes: start, people, minProfit */
        val solution = Array(N) {
            Array(n + 1) {
                IntArray(minProfit + 1) { -1 }
            }
        }
        return profitableSchemesStartingFrom(0, n, minProfit, group, profit, solution)
    }

    private fun profitableSchemesStartingFrom(
        start: Int,
        maxPeople: Int,
        minProfit: Int,
        group: IntArray,
        profit: IntArray,
        solution: Array<Array<IntArray>>
    ): Int {
        if (maxPeople < 0) {
            return 0
        }
        if (start >= group.size) {
            return if (minProfit <= 0) {
                1
            } else {
                0
            }
        }
        val solutionFromTable = solution[start][maxPeople][minProfit]
        if (solutionFromTable != -1) {
            return solutionFromTable
        }
        val profitIfCrimeCommited = profitableSchemesStartingFrom(
            start + 1,
            maxPeople - group[start],
            maxOf(minProfit - profit[start], 0),
            group,
            profit,
            solution
        )
        val profitIfCrimeIsNotCommited = profitableSchemesStartingFrom(
            start + 1,
            maxPeople,
            minProfit,
            group,
            profit,
            solution
        )
        val result = (profitIfCrimeCommited + profitIfCrimeIsNotCommited) % 1_000_000_007
        solution[start][maxPeople][minProfit] = result
        return result
    }
}