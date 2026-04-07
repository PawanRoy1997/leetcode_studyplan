package pawanroy.leetcode.`2069-walking-robot`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RobotTest {
    private lateinit var robot: Robot

    @BeforeEach
    fun setUp() {
        robot = Robot(4, 4)
    }

    @Test
    fun aRoundTrip() {

        val expectedPositions = listOf(
            intArrayOf(0, 0), // 0
            intArrayOf(1, 0), // 1
            intArrayOf(2, 0), // 2
            intArrayOf(3, 0), // 3
            intArrayOf(3, 1), // 4
            intArrayOf(3, 2), // 5
            intArrayOf(3, 3), // 6
            intArrayOf(2, 3), // 7
            intArrayOf(1, 3), // 8
            intArrayOf(0, 3), // 9
            intArrayOf(0, 2), // 10
            intArrayOf(0, 1), // 11
            intArrayOf(0, 0)  // 12 (back to origin)
        )

        val expectedDirections = listOf(
            "East",  // 0
            "East",  // 1
            "East",  // 2
            "East",  // 3
            "North", // 4
            "North", // 5
            "North", // 6
            "West",  // 7
            "West",  // 8
            "West",  // 9
            "South", // 10
            "South", // 11
            "South"  // 12 ⚠️ important edge case
        )

        // Step 0 check
        assertArrayEquals(expectedPositions[0], robot.getPos())
        assertEquals(expectedDirections[0], robot.getDir())

        for (i in 1..12) {
            robot.step(1)

            assertArrayEquals(
                expectedPositions[i],
                robot.getPos(),
                "Position mismatch at step $i"
            )

            assertEquals(
                expectedDirections[i],
                robot.getDir(),
                "Direction mismatch at step $i"
            )
        }
    }
}