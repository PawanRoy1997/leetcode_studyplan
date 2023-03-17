package pawanroy.leetcode.`208-implement-trie`

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TrieTest {
    @Test
    fun caseOne() {
        val trie = Trie()
        trie.insert("apple")
        assertTrue(trie.search("apple"))

        assertFalse(trie.search("app"))

        assertTrue(trie.startsWith("app"))

        trie.insert("app")
        assertTrue(trie.search("app"))
    }

    @Test
    fun caseTwo() {
        val trie = Trie()

        assertFalse(trie.search("app"))
        trie.insert("app")
        assertTrue(trie.search("app"))
        assertTrue(trie.startsWith("app"))
    }

    @Test
    fun caseThree() {
        val trie = Trie()
        trie.insert("app")
        trie.insert("apple")
        trie.insert("beer")
        trie.insert("add")
        trie.insert("jam")
        trie.insert("rental")
        assertTrue(trie.search("app"))
        assertTrue(trie.search("beer"))
        assertTrue(trie.search("jam"))
        assertTrue(trie.startsWith("app"))
        assertTrue(trie.startsWith("ad"))
        assertTrue(trie.startsWith("rent"))
        assertTrue(trie.startsWith("beer"))
        assertTrue(trie.startsWith("jam"))
        assertFalse(trie.search("jan"))
        assertFalse(trie.search("applepie"))
        assertFalse(trie.search("apps"))
        assertFalse(trie.search("ad"))
        assertFalse(trie.search("rest"))
        assertFalse(trie.search("rent"))
        assertFalse(trie.startsWith("apps"))
        assertFalse(trie.startsWith("applepie"))
        assertFalse(trie.startsWith("rest"))
        assertFalse(trie.startsWith("jan"))
    }
}