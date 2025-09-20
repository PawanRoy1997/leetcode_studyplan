package pawanroy.leetcode.`3508-implement-router`

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals


class RouterTest {
    @Test
    fun caseLightAndSimple() {
        val router = Router(2)
        assertTrue(router.addPacket(7, 4, 90))
        assertContentEquals(intArrayOf(7, 4, 90), router.forwardPacket())
        assertTrue(router.forwardPacket().isEmpty())
    }

    @Test
    fun caseLightAndLong() {
        val router = Router(3)
        assertTrue(router.addPacket(1, 4, 90))
        assertTrue(router.addPacket(2, 5, 90))
        assertFalse(router.addPacket(1, 4, 90))
        assertTrue(router.addPacket(3, 5, 95))
        assertTrue(router.addPacket(4, 5, 105))
        assertContentEquals(intArrayOf(2, 5, 90), router.forwardPacket())
        assertTrue(router.addPacket(5, 2, 110))
        assertEquals(1, router.getCount(5, 100, 110))
    }
}