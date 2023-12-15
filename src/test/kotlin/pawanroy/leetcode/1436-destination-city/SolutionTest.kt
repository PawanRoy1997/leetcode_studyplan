package pawanroy.leetcode.`1436-destination-city`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        val input = listOf(listOf("London","New York"), listOf("New York","Lima"), listOf("Lima","Sao Paulo"))
        assertEquals("Sao Paulo", sol.destCity(input))
    }

    @Test
    fun caseTwo(){
        val input = listOf(listOf("B","C"), listOf("D","B"), listOf("C","A"))
        assertEquals("A", sol.destCity(input))
    }
}