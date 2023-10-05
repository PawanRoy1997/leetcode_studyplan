package pawanroy.leetcode.`229-majority-element-ii`

class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        if (nums.isEmpty()) return emptyList()
        val requiredCount = nums.size.toDouble() / 3.0

        val numberCountMap = HashMap<Int, Int>()
        nums.forEach {
            numberCountMap[it] = numberCountMap.getOrElse(it) { 0 } + 1
        }

        val result = ArrayList<Int>()
        numberCountMap.forEach { (key, value) ->
            if(value.toDouble() > requiredCount) result.add(key)
        }

        return result
    }
}