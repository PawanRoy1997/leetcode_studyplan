package pawanroy.leetcode.`2491-divide-players-into-equals-skills`

class Solution {
    fun dividePlayers(skill: IntArray): Long {
        val avg = (skill.sum() * 2) / skill.size

        val list = ArrayList<Pair<Int, Int>>()

        skill.sort()
        val sortedList = ArrayList<Int>()
        skill.forEach(sortedList::add)

        while (sortedList.isNotEmpty()) {
            val first = sortedList.first()
            sortedList.removeFirst()
            if (sortedList.isNotEmpty() && sortedList.last() == (avg - first)) {
                list.add(Pair(first, avg - first))
                sortedList.removeLast()
            }
        }

        return if (list.size < (skill.size / 2)) -1L else list.sumOf { it.first.toLong() * it.second.toLong() }
    }
}