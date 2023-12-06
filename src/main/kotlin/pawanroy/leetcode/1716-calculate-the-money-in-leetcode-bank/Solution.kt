package pawanroy.leetcode.`1716-calculate-the-money-in-leetcode-bank`

class Solution {
    fun totalMoney(n: Int): Int {
        var days = n
        var mondayDeposit = 0
        var dayOfWeek = 0
        var prev = 0
        var res = 0
        while (days-- > 0) {
            if(dayOfWeek == 0 || dayOfWeek == 7){
                dayOfWeek = 0
                mondayDeposit++
                res+= mondayDeposit
                prev = mondayDeposit
            }else{
                prev++
                res+= prev
            }
            dayOfWeek++
        }
        return res
    }
}