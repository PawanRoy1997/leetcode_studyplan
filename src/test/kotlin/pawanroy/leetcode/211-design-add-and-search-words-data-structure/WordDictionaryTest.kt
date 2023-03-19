package pawanroy.leetcode.`211-design-add-and-search-words-data-structure`

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WordDictionaryTest {

    private lateinit var sol : WordDictionary

    @BeforeEach
    fun setup(){
        sol = WordDictionary()
    }

    @Test
    fun caseOne() {
        sol.addWord("bad")
        sol.addWord("dad")
        sol.addWord("mad")
        assertFalse(sol.search("pad"))
        assertTrue(sol.search("bad"))
        assertTrue(sol.search(".ad"))
        assertTrue(sol.search("m.."))
    }

    @Test
    fun caseTwo() {
        assertFalse(sol.search(".a"))
        sol.addWord("a")
        sol.addWord("ab")
        sol.addWord("")
        assertTrue(sol.search("a"))
        assertTrue(sol.search("a."))
        assertTrue(sol.search("ab"))
        assertFalse(sol.search(".a"))
        assertTrue(sol.search(".b"))
        assertFalse(sol.search("ab."))
        assertTrue(sol.search("."))
        assertTrue(sol.search(""))
        assertTrue(sol.search(".."))
    }
}