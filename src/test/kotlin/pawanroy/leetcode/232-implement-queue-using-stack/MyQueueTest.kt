package pawanroy.leetcode.`232-implement-queue-using-stack`

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class MyQueueTest {
    private lateinit var q: MyQueue

    @BeforeEach
    fun setup() {
        q = MyQueue()
    }

    @Test
    fun caseOne() {
        q.push(1)
        q.push(2)
        assertEquals(1, q.peek())
        assertEquals(1, q.pop())
        assertFalse(q.empty())
    }
}