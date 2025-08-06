package pawanroy.leetcode.`904-fruits-into-basket`

class Solution {
    fun totalFruit(fruits: IntArray): Int {
        var start = 0
        var end = 0
        val lastOf = HashMap<Int, Int>()
        val types = mutableSetOf<Int>()
        var res = 0
        while(end < fruits.size){
            types.add(fruits[end])
            lastOf[fruits[end]] = end

            if(types.size == 3){
                res = maxOf(res, end - start)
                var fruit = -1
                var index = Int.MAX_VALUE
                lastOf.forEach{ (k,v) ->
                    if(v < index){
                        index = v
                        fruit = k
                    }
                }
                lastOf.remove(fruit)
                types.remove(fruit)
                start = index+1
            }
            end++
        }

        res = maxOf(res, end - start)
        return res
    }
}