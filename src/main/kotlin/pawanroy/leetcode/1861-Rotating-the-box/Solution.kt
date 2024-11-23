package pawanroy.leetcode.`1861-Rotating-the-box`

class Solution {
    private val stone = '#'
    private val stationary = '*'
    private val space = '.'

    fun rotateTheBox(box: Array<CharArray>): Array<CharArray> {
        var startStone: Int

        box.forEach { arr ->
            startStone = -1
            arr.forEachIndexed { index, c ->
                if (c == stone && startStone == -1) {
                    startStone = index
                    return@forEachIndexed
                }
                if (c == space && startStone != -1) {
                    arr[startStone] = space
                    startStone++
                    arr[index] = stone
                    return@forEachIndexed
                }
                if(c == stationary){
                    startStone = -1
                }
            }
        }

        val lastIndex = box.lastIndex

        return Array(box.first().size){ i ->
            CharArray(box.size){ j -> box[lastIndex - j][i] }
        }
    }
}