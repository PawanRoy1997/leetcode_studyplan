package pawanroy.leetcode.`733-flood-fill`

class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        fillColor(image, image.size, image.first().size, sr, sc, image[sr][sc], color)
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
        if (sr < 0) return
        if (sr >= rows) return
        if (sc < 0) return
        if (sc >= columns) return
        if (image[sr][sc] != color) return
        if (image[sr][sc] == newColor) return
        image[sr][sc] = newColor
        fillColor(image, rows, columns, sr - 1, sc, color, newColor)
        fillColor(image, rows, columns, sr + 1, sc, color, newColor)
        fillColor(image, rows, columns, sr, sc - 1, color, newColor)
        fillColor(image, rows, columns, sr, sc + 1, color, newColor)
    }
}