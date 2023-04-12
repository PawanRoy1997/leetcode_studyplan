package pawanroy.leetcode.`71-simplify-path`

class Solution {
    fun simplifyPath(path: String): String {
        val directories = path.split("/").filter { it.isNotEmpty() }.filter { it != "." }
        val res = ArrayList<String>()
        val lastIndex = directories.lastIndex
        var count = 0
        for (index in directories.indices) {
            if (directories[lastIndex - index] == "..") count += 1
            else if (count > 0) count -= 1
            else res.add(directories[lastIndex - index])
        }

        res.reverse()
        return res.joinToString(prefix = "/", separator = "/", postfix = "")
    }
}