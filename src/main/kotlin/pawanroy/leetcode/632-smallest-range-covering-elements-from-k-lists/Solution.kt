package pawanroy.leetcode.`632-smallest-range-covering-elements-from-k-lists`

import java.util.PriorityQueue

internal class Solution {
    fun smallestRange(nums: List<List<Int>>): IntArray {
        // Min-Heap: stores (value, list index, element index)
        val minHeap = PriorityQueue { a: IntArray, b: IntArray -> a[0] - b[0] }
        var curMax = Int.MIN_VALUE

        // Initialize the heap with the first element of each list
        for (i in nums.indices) {
            minHeap.offer(intArrayOf(nums[i][0], i, 0))
            curMax = maxOf(curMax, nums[i][0])
        }

        // Track the smallest range
        val smallRange = intArrayOf(0, Int.MAX_VALUE)

        while (true) {
            // Get the minimum element from the heap
            val curr = minHeap.poll()
            val curMin = curr[0]
            val listIdx = curr[1]
            val elemIdx = curr[2]

            // Update the smallest range if a better one is found
            if ((curMax - curMin < smallRange[1] - smallRange[0]) ||
                (curMax - curMin == smallRange[1] - smallRange[0] && curMin < smallRange[0])
            ) {
                smallRange[0] = curMin
                smallRange[1] = curMax
            }

            // Move to the next element in the same list
            if (elemIdx + 1 < nums[listIdx].size) {
                val nextVal = nums[listIdx][elemIdx + 1]
                minHeap.offer(intArrayOf(nextVal, listIdx, elemIdx + 1))
                curMax = maxOf(curMax, nextVal)
            } else {
                // If any list is exhausted, stop
                break
            }
        }
        return smallRange
    }
}