package pawanroy.leetcode.`2491-divide-players-into-equals-skills`

class Solution {
    fun dividePlayers(skill: IntArray): Long {
        var res = 0L

        val frequency = IntArray(1001) { 0 }
        skill.forEach { frequency[it]++ }

        var start = 1
        var end = 1000

        var avg = -1

        while(start<=end){
            if(frequency[start] == 0) {
                start++
                continue
            }
            if(frequency[end] == 0) {
                end--
                continue
            }

            if(avg == -1){
                avg = start + end
            }

            if(start + end == avg){
                res += start.toLong()* end.toLong()
                frequency[start]--
                frequency[end]--
            }else{
                end = -1
            }
        }

        return if (end == -1) -1L else res
    }
}