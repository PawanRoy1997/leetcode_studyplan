package pawanroy.leetcode.`121-best-time-to-buy-and-sell-stocks`

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = prices.first()
        var profit = 0
        prices.forEach {
            if (min > it) {
                min = it
            }
            if (it - min > profit) {
                profit = it - min
            }
        }
        return profit
    }
}