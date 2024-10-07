package pawanroy.leetcode.`2696-minimum-length-of-string-after-removing-substring`

class Solution {
    fun minLength(s: String): Int {
        var res = s
        while(res.contains("AB")|| res.contains("CD")){
            if(res.contains("AB")){
                val i = res.indexOf("AB")
                res = res.removeRange(i, i+2)
            }
            if(res.contains("CD")){
                val i = res.indexOf("CD")
                res = res.removeRange(i, i+2)
            }
        }
        return res.length
    }
}