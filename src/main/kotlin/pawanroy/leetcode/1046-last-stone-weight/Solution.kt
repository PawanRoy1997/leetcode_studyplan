package pawanroy.leetcode.`1046-last-stone-weight`

class Solution {
    fun lastStoneWeight(stones: IntArray): Int {

        if (stones.size < 2) return stones[0]

        val stonesArr = ArrayList<Int>()
        for (stone in stones) stonesArr.add(stone)

        while (stonesArr.size > 1) {
            var max = 0
            var sec = 0
            for (stone in stonesArr) if (stone > max) {
                sec = max
                max = stone
            } else if (stone > sec) sec = stone
            stonesArr.remove(max)
            stonesArr.remove(sec)
            stonesArr.add(max - sec)
        }

        return stonesArr.first()
    }
}