package pawanroy.leetcode.`235-lowest-common-ancestor-in-binary-search-tree`

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertEquals
import kotlin.test.assertNull

class SolutionTest {
    @Test
    fun testNullRoot() {
        assertNull(solution.lowestCommonAncestor(null, secondGenFirstChild, secondGenSecondChild))
    }

    @Test
    fun testFirstChildNull() {
        assertNull(solution.lowestCommonAncestor(firstChild, null, lastGenSecondChild))
    }

    @Test
    fun testSecondChildNull() {
        assertNull(solution.lowestCommonAncestor(firstChild, secondGenFirstChild, null))
    }

    @Test
    fun testDirectChild() {
        assertEquals(firstChild, solution.lowestCommonAncestor(firstChild, secondGenFirstChild, secondGenSecondChild))
    }

    @Test
    fun testIndirectChild() {
        assertEquals(firstChild, solution.lowestCommonAncestor(firstChild, lastGenFirstChild, lastGenSecondChild))
    }

    @Test
    fun testItself() {
        assertEquals(firstChild, solution.lowestCommonAncestor(firstChild, firstChild, secondGenFirstChild))
    }

    companion object {
        @JvmStatic
        @BeforeAll
        fun setUp() {
            solution = Solution()
            secondGenFirstChild = TreeNode(2)
            secondGenSecondChild = TreeNode(8)
            lastGenFirstChild = TreeNode(3)
            lastGenSecondChild = TreeNode(7)
            firstChild = TreeNode(6)

            firstChild.left = secondGenFirstChild
            firstChild.right = secondGenSecondChild

            secondGenFirstChild.left = TreeNode(0)
            secondGenFirstChild.right = lastGenFirstChild

            secondGenSecondChild.left = lastGenSecondChild
            secondGenSecondChild.right = TreeNode(9)
        }

        lateinit var solution: Solution
        lateinit var firstChild: TreeNode
        lateinit var secondGenFirstChild: TreeNode
        lateinit var secondGenSecondChild: TreeNode
        lateinit var lastGenFirstChild: TreeNode
        lateinit var lastGenSecondChild: TreeNode
    }
}