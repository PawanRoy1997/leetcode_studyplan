package pawanroy.leetcode.`1948-delete-duplicate-folders`

class Solution {

    class Trie {
        var serial: String = ""
        val children: MutableMap<String, Trie> = mutableMapOf()
    }

    fun deleteDuplicateFolder(paths: List<List<String>>): List<List<String>> {
        val root = Trie()

        // Build the Trie tree
        for (path in paths) {
            var current = root
            for (node in path) {
                current = current.children.computeIfAbsent(node) { Trie() }
            }
        }

        val freq = mutableMapOf<String, Int>()
        construct(root, freq)

        val result = mutableListOf<List<String>>()
        val currentPath = mutableListOf<String>()
        operate(root, freq, currentPath, result)

        return result
    }

    private fun construct(node: Trie, freq: MutableMap<String, Int>) {
        if (node.children.isEmpty()) return

        val serialList = mutableListOf<String>()
        for ((key, child) in node.children) {
            construct(child, freq)
            serialList.add("$key(${child.serial})")
        }

        serialList.sort()
        node.serial = serialList.joinToString("")
        freq[node.serial] = freq.getOrDefault(node.serial, 0) + 1
    }

    private fun operate(
        node: Trie,
        freq: Map<String, Int>,
        path: MutableList<String>,
        result: MutableList<List<String>>
    ) {
        if (node.serial.isNotEmpty() && (freq[node.serial] ?: 0) > 1) return

        if (path.isNotEmpty()) {
            result.add(path.toList())
        }

        for ((key, child) in node.children) {
            path.add(key)
            operate(child, freq, path, result)
            path.removeAt(path.size - 1)
        }
    }
}
