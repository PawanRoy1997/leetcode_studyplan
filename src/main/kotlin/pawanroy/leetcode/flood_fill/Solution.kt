package pawanroy.leetcode.flood_fill

class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        if (image[sr][sc] != color) {
            fillColor(image, image.size, image.first().size, sr, sc, image[sr][sc], color)
        }
        return image
    }

    private fun fillColor(
        image: Array<IntArray>,
        rows: Int,
        columns: Int,
        sr: Int,
        sc: Int,
        color: Int,
        newColor: Int
    ) {
        if (sr < 0 || sr >= rows || sc < 0 || sc >= columns || image[sr][sc] != color) return
        image[sr][sc] = newColor
        fillColor(image, rows, columns, sr-1, sc, color, newColor)
        fillColor(image, rows, columns, sr+1, sc, color, newColor)
        fillColor(image, rows, columns, sr, sc-1, color, newColor)
        fillColor(image, rows, columns, sr, sc+1, color, newColor)
    }
}