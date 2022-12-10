package pawanroy.leetcode.isomorphic_strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    @Test
    fun testCaseOne(){
        assertTrue(Solution().isIsomorphic("add","egg"))
    }
    @Test
    fun testCaseTwo(){
        assertFalse(Solution().isIsomorphic("abcdefghijklmnopqrstuvwxyzva","abcdefghijklmnopqrstuvwxyzck"))
    }
    @Test
    fun testCaseThree(){
        assertTrue(Solution().isIsomorphic("ADD","egg"))
    }
}