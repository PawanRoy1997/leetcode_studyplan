package pawanroy.leetcode.`2353-desing-food-rating-system`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FoodRatingsText {

    @Test
    fun caseOne() {
        val fr = FoodRatings(
            foods = arrayOf("kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"),
            cuisines = arrayOf("korean", "japanese", "japanese", "greek", "japanese", "korean"),
            ratings = intArrayOf(9, 12, 8, 15, 14, 7)
        )
        assertEquals("kimchi", fr.highestRated("korean"))
        assertEquals("ramen", fr.highestRated("japanese"))

        fr.changeRating("sushi", 16)
        assertEquals("sushi", fr.highestRated("japanese"))

        fr.changeRating("ramen", 16)
        assertEquals("ramen", fr.highestRated("japanese"))
    }
}