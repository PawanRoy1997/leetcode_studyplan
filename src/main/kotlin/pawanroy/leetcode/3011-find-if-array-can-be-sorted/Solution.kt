package pawanroy.leetcode.`3011-find-if-array-can-be-sorted`

class Solution {
    fun canSortArray(nums: IntArray): Boolean {
        var temp: ArrayList<Int> = arrayListOf()
        val map: MutableMap<Int, Int> = HashMap()
        nums.forEach { map[it] = it.countOneBits(); temp.add(it) }
        var res = true
        val n = temp.size

        while(res){
            var i = 1
            var swap = false
            while(i < n){
                if(temp[i - 1] < temp[i]) i++
                else if(map[temp[i-1]] == map[temp[i]]){
                    temp[i-1]+= temp[i]
                    temp[i] = temp[i-1] - temp[i]
                    temp[i-1] -= temp[i]
                    swap = true
                }else{
                    res = false
                    break
                }
            }
            if(i == n && !swap) break
        }

        return res
    }
}