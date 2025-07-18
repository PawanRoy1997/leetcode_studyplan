package pawanroy.leetcode.`2163-minimum-difference-in-sums`

import java.util.*

class Solution {

    fun minimumDifference(nums: IntArray): Long {
        val n = nums.size / 3

        val part1 = LongArray(n + 1)
        val maxHeap = PriorityQueue<Int>(compareByDescending { it })

        var sumLeft = 0L
        for (i in 0 until n) {
            sumLeft += nums[i]
            maxHeap.add(nums[i])
        }
        part1[0] = sumLeft

        for (i in n until 2 * n) {
            sumLeft += nums[i]
            maxHeap.add(nums[i])
            sumLeft -= maxHeap.poll()
            part1[i - n + 1] = sumLeft
        }


        val minHeap = PriorityQueue<Int>()
        var sumRight = 0L
        for (i in nums.lastIndex downTo 2 * n) {
            sumRight += nums[i]
            minHeap.add(nums[i])
        }

        var minDiff = part1[n] - sumRight

        for (i in 2 * n - 1 downTo n) {
            sumRight += nums[i]
            minHeap.add(nums[i])
            sumRight -= minHeap.poll()
            val leftIndex = i - n
            minDiff = minOf(minDiff, part1[leftIndex] - sumRight)
        }

        return minDiff
    }
}