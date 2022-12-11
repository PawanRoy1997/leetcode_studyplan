package pawanroy.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TreeNodeTest {
    val nodeLeft = TreeNode(1)
    val nodeRight = TreeNode(1)
    val testNode = TreeNode(1)

    @Test
    fun testLeft() {
        testNode.left = nodeLeft
        assertEquals(nodeLeft, testNode.left)
        testNode.left = nodeRight
        assertEquals(nodeRight, testNode.left)
    }

    @Test
    fun testRight() {
        testNode.right = nodeLeft
        assertEquals(nodeLeft, testNode.right)
        testNode.right = nodeRight
        assertEquals(nodeRight, testNode.right)

    }

    @Test
    fun testVal() {
        assertEquals(1, testNode.`val`)
        testNode.`val` = 2
        assertEquals(2, testNode.`val`)
    }
}