package pawanroy.leetcode.`1942-smallest-unoccupied-chair`

class Solution {
    fun smallestChair(times: Array<IntArray>, targetFriend: Int): Int {
        val arrivalTime = times[targetFriend].first()
        val chair = hashMapOf<Int, IntArray>()
        times.sortBy { it.first() }

        var currentFriend = times.first()
        var friendIndex = 0
        var chairIndex = 0
        var run = true

        while(currentFriend[0] <= arrivalTime && run){
            chairIndex = 0
            while(chair.containsKey(chairIndex) && (chair[chairIndex]?.get(1) ?: 0) > currentFriend[0]){
                chairIndex++
            }
            chair[chairIndex] = currentFriend
            if(friendIndex < times.lastIndex)
            currentFriend = times[++friendIndex]
            else run = false
        }

        return chairIndex
    }
}