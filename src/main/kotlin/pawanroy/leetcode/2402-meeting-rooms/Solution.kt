package pawanroy.leetcode.`2402-meeting-rooms`

import java.util.*

class Solution {
    fun mostBooked(n: Int, meetings: Array<IntArray>): Int {
        val roomUseCount = IntArray(n)

        // Min-heap of available room indices
        val availableRooms = PriorityQueue<Int>()
        for (i in 0 until n) availableRooms.add(i)

        // Min-heap of Pair<endTime, roomIndex>
        val occupiedRooms = PriorityQueue(compareBy<Pair<Long, Int>> { it.first }.thenBy { it.second })

        // Sort meetings by start time
        meetings.sortBy { it[0] }

        for (meeting in meetings) {
            val start = meeting[0].toLong()
            val end = meeting[1].toLong()

            // Free up rooms that have ended by the start time
            while (occupiedRooms.isNotEmpty() && occupiedRooms.peek().first <= start) {
                availableRooms.add(occupiedRooms.poll().second)
            }

            if (availableRooms.isNotEmpty()) {
                // Assign to the lowest-indexed available room
                val room = availableRooms.poll()
                roomUseCount[room]++
                occupiedRooms.add(Pair(end, room))
            } else {
                // Delay the meeting to the earliest available room
                val (nextAvailableTime, room) = occupiedRooms.poll()
                roomUseCount[room]++
                val newEnd = nextAvailableTime + (end - start)
                occupiedRooms.add(Pair(newEnd, room))
            }
        }

        // Return the room with the maximum usage (tie -> smallest index)
        var maxCount = 0
        var roomIndex = 0
        for (i in 0 until n) {
            if (roomUseCount[i] > maxCount) {
                maxCount = roomUseCount[i]
                roomIndex = i
            }
        }

        return roomIndex
    }
}
