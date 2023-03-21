package pawanroy.leetcode.`350-intersection-of-two-arrays-ii`

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()

        var ptr1 = 0
        var ptr2 = 0

        val result = ArrayList<Int>()

        while (ptr1 < nums1.size && ptr2 < nums2.size) {
            if (nums1[ptr1] == nums2[ptr2]) {
                result.add(nums1[ptr1])
                ptr1++;ptr2++
            } else if (nums1[ptr1] > nums2[ptr2]) ptr2++
            else ptr1++
        }

        return result.toIntArray()
    }
}