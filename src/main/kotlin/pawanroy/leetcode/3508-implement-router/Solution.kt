package pawanroy.leetcode.`3508-implement-router`

import java.util.LinkedList
import java.util.Queue

class Router(private val size: Int) {
    private val packets = HashMap<Long, IntArray>()
    private val counts = HashMap<Int, MutableList<Int>>()
    private val queue: Queue<Long> = LinkedList()

    fun addPacket(source: Int, destination: Int, timestamp: Int): Boolean {
        val key = encode(source, destination, timestamp)

        if (packets.containsKey(key)) return false

        if (packets.size >= size) {
            forwardPacket()
        }

        packets[key] = intArrayOf(source, destination, timestamp)
        queue.offer(key)
        counts.computeIfAbsent(destination) { mutableListOf() }.add(timestamp)

        return true
    }

    fun forwardPacket(): IntArray {
        if (packets.isEmpty()) return intArrayOf()

        val key = queue.poll()
        val packet = packets.remove(key) ?: return intArrayOf()

        val destination = packet[1]
        counts[destination]?.removeAt(0)

        return packet
    }

    fun getCount(destination: Int, startTime: Int, endTime: Int): Int {
        val list = counts[destination] ?: return 0
        if (list.isEmpty()) return 0

        val left = lowerBound(list, startTime)
        val right = upperBound(list, endTime)

        return right - left
    }

    private fun encode(source: Int, destination: Int, timestamp: Int): Long {
        return (source.toLong() shl 40) or (destination.toLong() shl 20) or timestamp.toLong()
    }

    private fun lowerBound(list: List<Int>, target: Int): Int {
        var low = 0
        var high = list.size

        while (low < high) {
            val mid = (low + high) ushr 1
            if (list[mid] < target) low = mid + 1 else high = mid
        }

        return low
    }

    private fun upperBound(list: List<Int>, target: Int): Int {
        var low = 0
        var high = list.size

        while (low < high) {
            val mid = (low + high) ushr 1
            if (list[mid] <= target) low = mid + 1 else high = mid
        }

        return low
    }
}


/**
 * Your Router object will be instantiated and called as such:
 * var obj = Router(memoryLimit)
 * var param_1 = obj.addPacket(source,destination,timestamp)
 * var param_2 = obj.forwardPacket()
 * var param_3 = obj.getCount(destination,startTime,endTime)
 */