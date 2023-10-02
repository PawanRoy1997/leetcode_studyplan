package pawanroy.leetcode.`2038-remove-colored-piece-if-both-neighbour-are-same-color`

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue { sol.winnerOfGame("AAABABB") }
    }

    @Test
    fun caseTwo() {
        assertFalse { sol.winnerOfGame("") }
        assertFalse { sol.winnerOfGame("AA") }
        assertFalse { sol.winnerOfGame("BBB") }
        assertFalse { sol.winnerOfGame("BB") }
    }

    @Test
    fun caseThree(){
        assertFalse { sol.winnerOfGame("ABBBBBBBAAA") }
    }
}