package pawanroy.leetcode.`1813-sentence-similarity-iii`

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue { sol.areSentencesSimilar("Hello Jane", "Hello my name is Jane") }
    }

    @Test
    fun caseTwo(){
        assertFalse { sol.areSentencesSimilar("Frog cool", "Frogs are cool") }
    }
}