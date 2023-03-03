package pawanroy.leetcode.container_with_most_water

import java.lang.Integer.min

class Solution {
    fun maxArea(height: IntArray): Int {
        var pointer1 = 0
        var pointer2 = height.lastIndex
        var result = 0
        var current: Int
        while (pointer1 != pointer2) {
            current = min(height[pointer1], height[pointer2]) * (pointer2 - pointer1)
            if (current > result) result = current
            if (height[pointer1] < height[pointer2]) pointer1++ else pointer2--
        }
        return result
    }
}