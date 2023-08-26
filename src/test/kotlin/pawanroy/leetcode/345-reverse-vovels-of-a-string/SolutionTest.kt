package pawanroy.leetcode.`345-reverse-vovels-of-a-string`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun testCaseOne(){
        assertEquals("holle", Solution().reverseVowels("hello"))
    }

    @Test
    fun testCaseTwo(){
        assertEquals("leotcede", Solution().reverseVowels("leetcode"))
    }
}