package pawanroy.leetcode.best_time_to_buy_and_sell_stocks

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