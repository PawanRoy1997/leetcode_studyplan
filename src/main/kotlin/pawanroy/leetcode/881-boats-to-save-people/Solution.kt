package pawanroy.leetcode.`881-boats-to-save-people`

class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sortDescending()
        var head = 0
        var tail = people.lastIndex
        var count = 0
        while (head <= tail) {

            if (people[head] + people[tail] <= limit && head != tail) tail--
            head++
            count++
        }

        return count
    }
}