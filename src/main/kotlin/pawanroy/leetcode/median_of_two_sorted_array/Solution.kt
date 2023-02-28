package pawanroy.leetcode.median_of_two_sorted_array

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val m = nums1.size
        val n = nums2.size
        if (m > n) return findMedianSortedArrays(nums2, nums1)
        var i = 0
        var j = 0
        var imin = 0
        var imax = m
        val half = (m + n + 1) / 2
        var maxLeft = 0.0
        while (imin <= imax) {
            i = (imin + imax) / 2
            j = half - i
            if (i < m && nums2[j - 1] > nums1[i]) {
                imin = i + 1
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                imax = i - 1
            } else {
                maxLeft = if (i == 0) {
                    nums2[j - 1].toDouble()
                } else if (j == 0) {
                    nums1[i - 1].toDouble()
                } else {
                    Math.max(nums1[i - 1], nums2[j - 1]).toDouble()
                }
                break
            }
        }
        if ((m + n) % 2 == 1) {
            return maxLeft
        }
        val minRight: Double = if (i == m) {
            nums2[j].toDouble()
        } else if (j == n) {
            nums1[i].toDouble()
        } else {
            Math.min(nums1[i], nums2[j]).toDouble()
        }
        return (maxLeft + minRight) / 2
    }
}