package pawanroy.leetcode.`2069-walking-robot`

class Robot(private val width: Int, private val height: Int) {

    private var steps = 0L
    private val perimeter = 2 * (width + height) - 4

    fun step(num: Int) {
        steps += num
    }

    fun getPos(): IntArray {
        if (perimeter == 0) return intArrayOf(0, 0)

        var s = steps % perimeter

        // Bottom edge (East)
        if (s < width - 1) {
            return intArrayOf(s.toInt(), 0)
        }
        s -= (width - 1)

        // Right edge (North)
        if (s < height - 1) {
            return intArrayOf(width - 1, s.toInt())
        }
        s -= (height - 1)

        // Top edge (West)
        if (s < width - 1) {
            return intArrayOf((width - 1 - s).toInt(), height - 1)
        }
        s -= (width - 1)

        // Left edge (South)
        return intArrayOf(0, (height - 1 - s).toInt())
    }

    fun getDir(): String {
        if (steps == 0L) return "East"

        val s = steps % perimeter

        return when {
            s == 0L -> "South"
            s < width -> "East"
            s < (width) + (height - 1) -> "North"
            s < (width - 1) * 2 + (height) -> "West"
            else -> "South"
        }
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * var obj = Robot(width, height)
 * obj.step(num)
 * var param_2 = obj.getPos()
 * var param_3 = obj.getDir()
 */