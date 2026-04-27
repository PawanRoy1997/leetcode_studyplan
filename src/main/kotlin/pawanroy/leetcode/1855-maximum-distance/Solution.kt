package pawanroy.leetcode.`1855-maximum-distance`

class Solution {

    fun maxDistance(nums1: IntArray, nums2: IntArray): Int {

        // Pointer for nums1
        var firstIndex = 0

        // Pointer for nums2
        var secondIndex = 0

        while (firstIndex < nums1.size && secondIndex < nums2.size) {

            // Invalid pair: nums1[i] must be <= nums2[j]
            if (nums1[firstIndex] > nums2[secondIndex]) {

                firstIndex++

                /*
                 After moving firstIndex forward, any secondIndex smaller than:
                 firstIndex + maximumDistance

                 cannot improve the current answer because:

                 distance = secondIndex - firstIndex < maximumDistance

                 So jump directly to the first useful candidate.
                */
                secondIndex++

            } else {

                // Try to increase distance further
                secondIndex++
            }
        }

        return maxOf(0, secondIndex - firstIndex - 1)
    }
}