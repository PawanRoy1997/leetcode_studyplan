package pawanroy.leetcode.`1912-desing-movie-rental-system`

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MovieRentingSystemTest {
    @Test
    fun caseSimpleShort() {
        val movieRentingSystem = MovieRentingSystem(
            3,
            arrayOf(
                intArrayOf(0, 1, 5),
                intArrayOf(0, 2, 6),
                intArrayOf(0, 3, 7),
                intArrayOf(1, 1, 4),
                intArrayOf(1, 2, 7),
                intArrayOf(2, 1, 5)
            )
        )
        assertContentEquals(listOf(1, 0, 2), movieRentingSystem.search(1))
        movieRentingSystem.rent(0, 1)
        movieRentingSystem.rent(1, 2)
        assertContentEquals(listOf(listOf(0,1),listOf(1,2)), movieRentingSystem.report())
        movieRentingSystem.drop(1, 2)
        assertContentEquals(listOf(0,1), movieRentingSystem.search(2))
    }
}