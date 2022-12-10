package pawanroy.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NodeTest{
    @Test
    fun testValue(){
        val node = Node(1)
        assertEquals(1, node.`val`)
        node.`val` = 2
        assertEquals(2, node.`val`)
    }

    @Test
    fun testChildren(){
        val childrenList = (0..10).map{Node(it)}.toList()
        val newNode = Node(11).apply { children = childrenList }
        assertEquals(childrenList, newNode.children)
    }
}