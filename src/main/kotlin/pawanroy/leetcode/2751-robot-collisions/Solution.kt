package pawanroy.leetcode.`2751-robot-collisions`

import java.util.SortedMap

class Solution {
    private var sortedSet: MutableMap<Int, Pair<Int, Int>> = HashMap()

    fun survivedRobotsHealths(positions: IntArray, healths: IntArray, directions: String): List<Int> {
        sortedSet = HashMap()
        val arrayList = ArrayList<Int>()
        for (index in positions.indices) {
            val direction = if (directions[index] == 'L') -1 else 1
            sortedSet[positions[index]] = Pair(healths[index], direction)
            arrayList.add(positions[index])
        }
        arrayList.sort()
        positions.forEach{
            if(sortedSet[it] != null)
            startElimination(it, arrayList)
        }

        arrayList.clear()
        positions.forEach{
            if(sortedSet[it] != null) arrayList.add(sortedSet[it]!!.first)
        }

        return arrayList
    }

    private fun startElimination(index: Int, indexed: List<Int>) {

        val startPosition = indexed[index]
        var robot = sortedSet[startPosition] ?: return

        val direction = robot.second
        var currentIndex = index + direction
        while (currentIndex in indexed.indices && (sortedSet[startPosition] != null)) {
            val nextRobot = sortedSet[currentIndex]
            if(nextRobot != null){
                if(direction != nextRobot.second) {
                    if (nextRobot.first > robot.first) {
                        sortedSet.remove(startPosition)
                        sortedSet[currentIndex] = Pair(nextRobot.first-1, nextRobot.second)
                        startElimination(currentIndex, indexed)
                    } else if (nextRobot.first < robot.first) {
                        sortedSet.remove(currentIndex)
                    } else {
                        sortedSet.remove(currentIndex)
                        sortedSet.remove(startPosition)
                        break
                    }
                } else startElimination(currentIndex, indexed)
            }
            currentIndex+= direction
        }
    }
}