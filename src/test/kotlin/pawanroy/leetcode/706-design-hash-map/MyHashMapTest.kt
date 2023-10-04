package pawanroy.leetcode.`706-design-hash-map`

import kotlin.test.Test
import kotlin.test.assertEquals

class MyHashMapTest {
    private val hashMap = MyHashMap()

    @Test
    fun caseOne() {
        hashMap.put(1, 1)
        hashMap.put(2, 2)
        assertEquals(1, hashMap.get(1))
        assertEquals(-1, hashMap.get(3))
        hashMap.put(2, 1)
        assertEquals(1, hashMap.get(2))
        hashMap.remove(2)
        assertEquals(-1, hashMap.get(2))
    }
}