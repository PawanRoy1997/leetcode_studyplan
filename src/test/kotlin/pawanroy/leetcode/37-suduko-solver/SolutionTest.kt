package pawanroy.leetcode.`37-suduko-solver`

import kotlin.test.Test

class SolutionTest {
    private val sol = Solution()
    private val checker = pawanroy.leetcode.`36-valid-suduko`.Solution()

    @Test
    fun caseOne() {
        val ans = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        ans.forEach {
            it.forEach(::print)
            println()
        }
        sol.solveSudoku(ans)

        ans.forEach {
            it.forEach(::print)
            println()
        }
        assert(checker.isValidSudoku(ans))

//        assertContentEquals(
//            arrayOf(
//                charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
//                charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
//                charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
//                charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
//                charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
//                charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
//                charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
//                charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
//                charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
//            ),
//            sol.solveSudoku(
//                arrayOf(
//                    charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
//                    charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
//                    charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
//                    charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
//                    charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
//                    charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
//                    charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
//                    charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
//                    charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
//                )
//            )
//        )
    }
}