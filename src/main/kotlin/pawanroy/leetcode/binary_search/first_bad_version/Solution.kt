package pawanroy.leetcode.binary_search.first_bad_version

class Solution : VersionControl() {
    override fun firstBadVersion(n: Int): Int {
        return nextIteration(1, n)
    }

    private fun nextIteration(start: Int, end: Int): Int {
        if (start == end) return start
        return if (end - start == 1) {
            if (isBadVersion(start))
                start
            else
                end
        } else {
            val long1 = start.toULong()
            val long2 = end.toULong()
            val result = (long1 + long2) / 2u
            print("start $start end $end result $result")
            if (isBadVersion(result.toInt())) {
                nextIteration(start, result.toInt())
            } else {
                nextIteration(result.toInt(), end)
            }
        }
    }
}

abstract class VersionControl {
    var badVersion: Int = 0

    fun isBadVersion(n: Int): Boolean {
        return n >= badVersion
    }

    abstract fun firstBadVersion(n: Int): Int
}
