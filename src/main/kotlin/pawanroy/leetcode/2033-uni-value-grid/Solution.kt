package pawanroy.leetcode.`2033-uni-value-grid`

class Solution {
    fun minOperations(grid: Array<IntArray>, x: Int): Int {
        val items = grid.flatMap { it.toList() }.sorted()
        val median = items[items.size / 2]

//        Check if solution is possible
        val remainder = median % x
        if(items.any { (it % x) != remainder }) return -1
        var count = 0
        for(item in items) {
            count += if(item <= median) {
                (median - item) / x
            }else{
                (item - median) / x
            }
        }
         return count
    }
}