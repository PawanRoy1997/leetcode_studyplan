package pawanroy.leetcode.`1048-longest-string-chain`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun caseOne(){
        val result = Solution().longestStrChain(arrayOf("xbc","pcxbcf","xb","cxbc","pcxbc"))
        assertEquals(5, result)
    }

    @Test
    fun caseTwo(){
        val result = Solution().longestStrChain(arrayOf("a","b","ba","bca","bda","bdca"))
        assertEquals(4, result)
    }

    @Test
    fun caseThree(){
        val result = Solution().longestStrChain(arrayOf("a","ab","ac","bd","abc","abd","abdd"))
        assertEquals(4, result)
    }

    @Test
    fun caseFour(){
        val result = Solution().longestStrChain(arrayOf("wnyxmflkf","xefx","usqhb","ttmdvv","hagmmn","tmvv","pttmdvv","nmzlhlpr","ymfk","uhpaglmmnn","zckgh","hgmmn","isqxrk","isqrk","nmzlhpr","uysyqhxb","haglmmn","xfx","mm","wymfkf","tmdvv","uhaglmmn","mf","uhaglmmnn","mfk","wnymfkf","powttkmdvv","kwnyxmflkf","xx","rnqbhxsj","uysqhb","pttkmdvv","hmmn","iq","m","ymfkf","zckgdh","zckh","hmm","xuefx","mv","iqrk","tmv","iqk","wnyxmfkf","uysyqhb","v","m","pwttkmdvv","rnqbhsj"))
        assertEquals(10, result)
    }
}