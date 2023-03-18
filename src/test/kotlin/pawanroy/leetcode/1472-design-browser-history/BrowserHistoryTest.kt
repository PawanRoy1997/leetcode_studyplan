package pawanroy.leetcode.`1472-design-browser-history`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BrowserHistoryTest {

    @Test
    fun caseOne() {
        val br = BrowserHistory("leetcode.com")
        br.visit("google.com")
        br.visit("facebook.com")
        br.visit("youtube.com")
        assertEquals("facebook.com",br.back(1))
        assertEquals("google.com",br.back(1))
        assertEquals("facebook.com",br.forward(1))
        br.visit("linkedin.com")
        assertEquals("linkedin.com",br.forward(2))
        assertEquals("google.com",br.back(2))
        assertEquals("leetcode.com",br.back(7))
    }
}