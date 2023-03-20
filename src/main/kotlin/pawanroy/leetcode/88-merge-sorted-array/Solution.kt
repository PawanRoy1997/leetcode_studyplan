package pawanroy.leetcode.`88-merge-sorted-array`

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var l1 = m
        var l2 = n
        var l3 = nums1.lastIndex
        while (l2 != 0) {
            if (l1 !=0 && nums1[l1 - 1] >= nums2[l2 - 1]) {
                nums1[l3] = nums1[l1 - 1]
                l1 -= 1
            } else {
                nums1[l3] = nums2[l2 - 1]
                l2 -= 1
            }
            l3--
        }
    }
}