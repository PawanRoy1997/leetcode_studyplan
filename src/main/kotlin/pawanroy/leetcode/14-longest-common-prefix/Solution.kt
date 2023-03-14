package pawanroy.leetcode.`14-longest-common-prefix`

import java.lang.StringBuilder

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = strs.first()
        var swap = StringBuilder()
        for(i in strs.indices){
            for(index in strs[i].indices){
                if(index >= result.length) break
                if(result[index] == strs[i][index]) swap = swap.append(result[index])
                else break
            }
            result = swap.toString()
            swap.clear()
        }
        return result
    }
}