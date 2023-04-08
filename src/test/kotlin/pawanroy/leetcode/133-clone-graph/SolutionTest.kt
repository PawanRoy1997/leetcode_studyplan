package pawanroy.leetcode.`133-clone-graph`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertNull(sol.cloneGraph(null), "Null graph")
    }

    @Test
    fun caseTwo() {
        val output = sol.cloneGraph(Node(1))
        assertEquals(1, output?.`val`, "Single node graph")
    }

    @Test
    fun caseThree() {
        val node1 = Node(1)
        val node2 = Node(2)
        node1.neighbors = arrayListOf(node2)
        node2.neighbors = arrayListOf(node1)
        assertEquals(1, sol.cloneGraph(node1)?.`val`, "Binary node graph")
        assertEquals(2, sol.cloneGraph(node1)?.neighbors?.first()?.`val`, "Binary node graph")
    }

    @Test
    fun caseFour() {
        val node1 = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)
        val node4 = Node(4)
        node1.neighbors.add(node2)
        node1.neighbors.add(node4)
        node2.neighbors.add(node1)
        node2.neighbors.add(node3)
        node3.neighbors.add(node2)
        node3.neighbors.add(node4)
        node4.neighbors.add(node1)
        node4.neighbors.add(node3)
        assertEquals(1, sol.cloneGraph(node1)?.`val`)
    }
}