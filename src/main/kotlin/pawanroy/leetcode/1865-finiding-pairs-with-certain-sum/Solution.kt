package pawanroy.leetcode.`1865-finiding-pairs-with-certain-sum`

class FindSumPairs(nums1: IntArray, nums2: IntArray) {
    val map1 = mutableMapOf<Int, Int>()
    val map2 = mutableMapOf<Int, Int>()

    init {
        nums1.forEach {
            map1[it] = map1.getOrElse(it) { 0 } + 1
        }
        nums2.forEach {
            map2[it] = map2.getOrElse(it) { 0 } + 1
        }
    }

    fun add(index: Int, `val`: Int) {
        val num = nums2[index]
        map2[num] = map2.getOrElse(num) { 1 } - 1

        nums2[index] = num + `val`
        map2[`val` + num] = map2.getOrElse(`val`+num) { 0 } + 1
    }

    fun count(tot: Int): Int {
        var ans = 0

        map1.forEach { (number, occurrence) ->
            ans += occurrence * map2.getOrElse(tot - number) { 0 }
        }

        return ans
    }
}