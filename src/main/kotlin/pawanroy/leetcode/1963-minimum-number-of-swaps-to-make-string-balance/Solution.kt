package pawanroy.leetcode.`1963-minimum-number-of-swaps-to-make-string-balance`

class Solution {
    fun minSwaps(s: String): Int {
        var count = 0
        var level = 0

        s.forEach {
            if(it == '['){
                level++
            }else{
                if(level == 0){ count++ }
                else{ level-- }
            }
        }
        return count / 2 + count % 2
    }
}