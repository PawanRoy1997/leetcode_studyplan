package pawanroy.leetcode.`2573-find-string-with-lcp`

class Solution {
    fun findTheString(lcp: Array<IntArray>): String {
        val n = lcp.size
        val resArray = IntArray(n) { 0 }

        // Step 1: Enforce equality for lcp > 0
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (lcp[i][j] > 0) {
                    resArray[j] = resArray[i]
                }
            }
        }

        // Step 2: Handle lcp == 0 (your logic)
        for (i in 0 until n) for (j in 0 until n) {
            if (lcp[i][j] == 0 && resArray[i] == resArray[j]) {
                val min = minOf(i, j)
                val max = maxOf(i, j)
                resArray[max] = resArray[min] + 1
            }
        }

        // Step 3: Validate constraints
        for (i in lcp.indices) for (j in lcp.indices) {
            val m = n - minOf(i, j)
            if ((lcp[i][j] > 0 && lcp[i][j] > m) || (i == j && lcp[i][j] != m)) return ""

            if (lcp[i][j] == 0) continue

            if (!isCorrect(resArray, i, j, lcp[i][j])) {
                return ""
            }
        }

        // Step 4: Build string
        val result = StringBuilder()
        for (x in resArray) {
            if (x > 25) return "" // prevent invalid chars
            result.append('a' + x)
        }

        return result.toString()
    }

    private fun isCorrect(resArray: IntArray, a: Int, b: Int, currentLcp: Int): Boolean {
        val minIndex = minOf(a, b)
        val maxIndex = maxOf(a, b)

        if (maxIndex + currentLcp - 1 >= resArray.size) return false

        for (k in 0 until currentLcp) {
            if (resArray[minIndex + k] != resArray[maxIndex + k]) return false
        }

        if (maxIndex + currentLcp < resArray.size) {
            if (resArray[minIndex + currentLcp] == resArray[maxIndex + currentLcp]) return false
        }

        return true
    }
}