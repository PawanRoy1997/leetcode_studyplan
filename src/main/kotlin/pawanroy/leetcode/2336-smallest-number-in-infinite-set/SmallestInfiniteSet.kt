package pawanroy.leetcode.`2336-smallest-number-in-infinite-set`

class SmallestInfiniteSet {
    var count = 0
    private val priorityQueue = sortedSetOf<Int>()
    fun popSmallest(): Int {
        return if (priorityQueue.isEmpty()) ++count else priorityQueue.pollFirst() ?: 0
    }

    fun addBack(num: Int) {
        if (num <= count) priorityQueue.add(num)
    }
}