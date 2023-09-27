package pawanroy.leetcode.`880-decoded-string-at-index`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne(){
        assertEquals("o", sol.decodeAtIndex("leet2code3", 10))
    }

    @Test
    fun caseTwo(){
        assertEquals("h", sol.decodeAtIndex("ha22", 5))
    }

    @Test
    fun caseThree(){
        assertEquals("a", sol.decodeAtIndex("a2345678999999999999999", 1))
    }

    @Test
    fun caseFour(){
        assertEquals("y", sol.decodeAtIndex("y959q969u3hb22odq595", 222280369))
    }
}