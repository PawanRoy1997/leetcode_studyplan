package pawanroy.leetcode.`30-substring-with-concatination-of-all-words`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val expected = arrayOf(0, 9)
        val actual = sol.findSubstring("barfoothefoobarman", arrayOf("foo", "bar"))
        assertArrayEquals(expected, actual)
    }

    @Test
    fun caseTwo() {
        val expected = emptyArray<Int>()
        val actual = sol.findSubstring("wordgoodgoodgoodbestword", arrayOf("word", "good", "best", "word"))
        assertArrayEquals(expected, actual)
    }

    @Test
    fun caseThree() {
        val expected = arrayOf(6,9,12)
        val actual = sol.findSubstring("barfoofoobarthefoobarman", arrayOf("bar","foo","the"))
        assertArrayEquals(expected, actual)
    }

    @Test
    fun caseFour(){
        val expected = arrayOf(8)
        val actual = sol.findSubstring("wordgoodgoodgoodbestword", arrayOf("word","good","best","good"))
        assertArrayEquals(expected, actual)
    }


    private fun <T> assertArrayEquals(expected: Array<T>, actual: List<T>) {
        assertEquals(expected.size, actual.size)
        if (expected.size == actual.size) {
            expected.forEachIndexed { index, expect ->
                assertEquals(expect, actual[index])
            }
        }
    }
}