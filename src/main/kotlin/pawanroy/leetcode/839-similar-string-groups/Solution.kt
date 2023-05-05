package pawanroy.leetcode.`839-similar-string-groups`

class Solution {
    fun numSimilarGroups(strs: Array<String>): Int {
        var res = 0
        if (strs.isEmpty()) return 0

        val visited: MutableSet<String> = mutableSetOf()

        strs.forEach {
            if (!visited.contains(it)) {
                dfs(it, strs, visited); res++
            }
        }

        return res
    }

    fun dfs(curr: String, input: Array<String>, visited: MutableSet<String>) {
        if (visited.contains(curr)) return

        visited.add(curr)

        input.forEach {
            if (isSimilar(curr, it)) {
                dfs(it, input, visited)
            }
        }
    }

    private fun isSimilar(current: String, compareTo: String): Boolean {
        var count = 0
        val curr = current.toCharArray()
        val comp = compareTo.toCharArray()
        for (i in current.indices) {
            if (curr[i] != comp[i]) count++
            if (count > 2) return false
        }
        return true
    }
}